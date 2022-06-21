package com.etsy.utilities;

public class BrowserUtils {
    /**
     * This method only using for static waiting
     * accept seconds
     * @param seconds
     */

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {

        }
    }
}
