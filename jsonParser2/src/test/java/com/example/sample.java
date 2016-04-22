package com.example;

import org.junit.Test;

public class sample {

    @Test
    public void firstTest() {

        long startTime = System.nanoTime();

        TestPerformance.main(null);

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.

        System.out.println(duration);
    }
}
