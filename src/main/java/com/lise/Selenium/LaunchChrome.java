package com.lise.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/aaa/Downloads/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.co.in");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
