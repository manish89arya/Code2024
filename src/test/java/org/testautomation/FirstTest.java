package org.testautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pom.base.BaseTest;

import javax.swing.text.DateFormatter;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class FirstTest extends BaseTest {
    @Test
    public void dummyTest() {

//        getDriver().get("https://askomdch.com");
        getDriver().get("https://www.flipkart.com/");
        //  //input[@class='Pke_EE']
        //  input[placeholder='Search for Products, Brands and More']
        getDriver().findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("mobiles");
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        try {
            Thread.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        getDriver().findElement(By.cssSelector("li:nth-child(3) div:nth-child(1) a:nth-child(1) div:nth-child(2)")).click();

    }

    @Test()
    public void doubleClickTest() {
        getDriver().get("https://demo.guru99.com/test/simple_context_menu.html");
        getDriver().manage().window().maximize();
        WebElement element = getDriver().findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions actions = new Actions(getDriver());
        actions.doubleClick(element).perform();
        Alert alert = getDriver().switchTo().alert();
        System.out.println("Alert Text\n" + alert.getText());
        alert.accept();
    }

    @Test
    public void rightClickTest() {
        getDriver().get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement element = getDriver().findElement(By.xpath("//span[text()='right click me']"));
        Actions actions = new Actions(getDriver());
        actions.contextClick(element).perform();
    }

    @Test
    public void webTablesTest() {
        getDriver().get("https://datatables.net/");
        // //td[@class='sorting_1 dtr-control' and contains(text(),'Tiger Nixon')]//following-sibling::td[@class='dt-right']

        List<String> names = new ArrayList<>();
        int noOfElements=0;
        boolean isNextBtnEnabled = true;
        while (isNextBtnEnabled) {
            List<WebElement> namesElements = getDriver().findElements(By.xpath("//td[@class='sorting_1 dtr-control']"));
            noOfElements=noOfElements+namesElements.size();
            for (WebElement element : namesElements) {
                names.add(element.getText());
                System.out.println(element.getText());
            }
            try {
                getDriver().findElement(By.xpath("//button[@class= 'dt-paging-button next']")).click();
                Thread.sleep(Duration.ofSeconds(3));
            } catch (NoSuchElementException e) {
                isNextBtnEnabled = false;
                System.out.println("Next button is disabled now!");
            } catch (Exception e1)
            {
                isNextBtnEnabled = false;
                System.out.println("Exception occurred: " +e1.getMessage());
            }
        }
        System.out.println(names);
        System.out.println("Total no of elements "+noOfElements);
        getDriver().quit();
    }

    @Test
    public void filterWebTableData(){
        getDriver().get("https://datatables.net/");
        // Get oldest employee from London

        boolean isNextEnabled = true;
        List<String> listDates = new ArrayList<>();

        while(isNextEnabled){
            List<WebElement> startDateElements = getDriver().findElements(By.xpath("//td[@class='dt-right']"));
            for(WebElement startDate: startDateElements){
                listDates.add(startDate.getText());
                System.out.println(startDate.getText());
            }

            try{
                getDriver().findElement(By.xpath("//button[@class='dt-paging-button next']")).click();
                try {
                    Thread.sleep(Duration.ofSeconds(1));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }catch (NoSuchElementException e) {
                isNextEnabled = false;
                System.out.println("Next button is disabled now!");
                System.out.println("Checking presence of disabled button..");
                Assert.assertTrue(getDriver().findElement(By.xpath("//button[@class='dt-paging-button disabled next']")).isDisplayed());
            } catch (Exception e1)
            {
                isNextEnabled = false;
                System.out.println("Exception occurred: " +e1.getMessage());
            }
        }
        System.out.println("No of all 'Start Date' available: "+listDates.size());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/DD/YYYY");
        listDates.sort(Comparator.comparing(date -> LocalDate.parse(date, formatter)));
        System.out.println(listDates);
    }

}
