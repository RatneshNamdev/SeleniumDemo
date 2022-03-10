package com.lise.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/aaa/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver(); //load driver...

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //launch chrome browser...
        driver.findElement(By.name("proceed")).click(); //click on go btn...

        Alert alert=driver.switchTo().alert();

        String text=alert.getText();
        System.out.println(text);

        Thread.sleep(5000);

        if(text.equals("Please enter a valid user name")){
            System.out.println("Correct Alert msg..");
        }else {
            System.out.println("InCorrect Alert msg..");
        }

        alert.accept(); // click on "OK" Btn...

//        alert.dismiss(); //click on "Cancel" Btn....
    }
}
