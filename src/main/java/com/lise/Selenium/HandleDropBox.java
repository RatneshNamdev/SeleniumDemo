package com.lise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/aaa/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Ce%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D9299777%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAvaGRBhBlEiwAiY-yMDPOoq5OWoEN8MjBM-PcF4Smq9TFYVvRV4uV0KOII3aYqXhSB_d7sBoCS24QAvD_BwE");

        //handle drop box:....
        Select select=new Select(driver.findElement(By.id("month")));
        select.selectByVisibleText("Sep");
    }
}
