package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=";
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver(); //1.launch the url into browser
        driver.get(baseUrl);  //2.open the link into Chrome browser
        driver.manage().window().maximize(); //maximize the window
        System.out.println("Page Title :" + driver.getTitle());//3.print the page title
        System.out.println("Current URL : " + driver.getCurrentUrl()); //4.Print current url
        System.out.println("Page Source :" + driver.getPageSource()); //5.Print the page source
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); ////we give Implicit wait to driver
        driver.findElement(By.id("Email")).sendKeys("khushbu123@gmail.com"); //find email id
        driver.findElement(By.name("Password")).sendKeys("12345"); //find password
        driver.close(); //driver closing

    }


}
