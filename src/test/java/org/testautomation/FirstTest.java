package org.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    @Test
    public void dummyTest() {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://askomdch.com");
        driver.get("https://www.flipkart.com/");
        //  //input[@class='Pke_EE']
        //  input[placeholder='Search for Products, Brands and More']
        driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("mobiles");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        try {
            Thread.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector("li:nth-child(3) div:nth-child(1) a:nth-child(1) div:nth-child(2)")).click();

    }

}
