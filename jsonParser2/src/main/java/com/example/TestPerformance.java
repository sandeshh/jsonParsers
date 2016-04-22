package com.example;

import org.json.JSONObject;
import java.util.HashMap;
import java.util.UUID;
/**
 * Created by sandesh on 4/22/16.
 */
public class TestPerformance {

    private static final String[] eventTypes = new String[]{"view", "click", "purchase"};

    public static void main( String[] args )
    {
        HashMap<String, JSONObject > hashMap = new HashMap<String, JSONObject>();

        for ( int i = 0 ; i < 100000 ; ++i ) {

            String element = generateElement() ;

            JSONObject jsonObject;
            try {
                jsonObject = new JSONObject(element);
                hashMap.put(element, jsonObject);
            } catch (Exception e) {
            }

        }
    }

    public static String generateElement() {

        StringBuilder sb = new StringBuilder();

        sb.setLength(0);
        sb.append("{\"user_id\":\"");
        sb.append(UUID.randomUUID().toString());
        sb.append("\",\"page_id\":\"");
        sb.append(UUID.randomUUID().toString());
        sb.append("\",\"ad_id\":\"");
        sb.append(UUID.randomUUID().toString());
        sb.append("\",\"ad_type\":\"");
        sb.append("banner78"); // value is immediately discarded. The original generator would put a string with 38/5 = 7.6 chars. We put 8.
        sb.append("\",\"event_type\":\"");
        sb.append("view");
        sb.append("\",\"event_time\":\"");
        sb.append(System.currentTimeMillis());
        sb.append("\",\"ip_address\":\"1.2.3.4\"}");

        return sb.toString();
    }
}
