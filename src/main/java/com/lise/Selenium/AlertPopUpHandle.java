package com.lise.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/aaa/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver(); //load driver...

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //launch chrome browser...
        driver.findElement(By.name("proceed")).click(); //click on go btn...

        Alert alert=driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept(); // click on "OK" Btn...

//        alert.dismiss(); //click on "Cancel" Btn....
    }
}
