package com.lise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/aaa/Downloads/chromedriver");

        WebDriver driver=new ChromeDriver(); // launch browser...

        driver.get("http://html.com/input-type-file/");

        driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/Users/aaa/Desktop/myCodeWithGit/git-note.html");
    }
}
