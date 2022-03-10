package com.lise.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchSafari {
    public static void main(String[] args) {
        WebDriver driver=new SafariDriver();
        driver.get("http://www.google.co.in");

        System.out.println(driver.getTitle());
    }
}
