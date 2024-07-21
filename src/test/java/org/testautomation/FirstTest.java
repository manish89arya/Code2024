package org.testautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    WebDriver driver = new ChromeDriver();
    @Test
    public void dummyTest() {

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

    @Test()
    public void doubleClickTest()
    {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text\n" +alert.getText());
        alert.accept();
    }

    @Test
    public void rightClickTest(){
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
    }

}
