package com.etsy.utilities;

import org.openqa.selenium.By;

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


    public static String getText(){

        String result = Driver.getDriver().findElement(By.xpath("(//a[.='" + ConfigurationReader.getProperty("name") + "'])[1]")).getText();

        return result;

    }


}
