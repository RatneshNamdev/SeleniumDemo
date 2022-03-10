package com.lise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/aaa/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
        System.out.println(driver.getTitle());

        // Feeding using xpath ---2
        //absolute xpath should not be used like /html[1]/body[1]/div[2]/a.....
        //only relative xpath should be used.
//        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Ratnesh");
//        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Namdev");
//        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("ratnesh@ghfd");

        // Feeding using id ---1
//        driver.findElement(By.id("firstname")).sendKeys("Ratnesh");
//        driver.findElement(By.id("lastname")).sendKeys("Namdev");
//        driver.findElement(By.id("Email")).sendKeys("ghjsdj@");

        //Feeding using name ---3
//        driver.findElement(By.name("firstname")).sendKeys("Tom");
//        driver.findElement(By.name("lastname")).sendKeys("cruise");
        driver.findElement(By.name("Email")).sendKeys("ratnesh@yahoo.com");

        driver.findElement(By.cssSelector("#firstname")).sendKeys("Ratnesh");

        //ClassName ----4
        driver.findElement(By.className("action-link")).click();
    }
}
