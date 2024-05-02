package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.shoppersstop.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='profileImage']/a/i")).click();
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        String pgContent=driver.getPageSource();
        int length=driver.getPageSource().length();
        System.out.println(title);
        System.out.println(pgContent);
        System.out.println(length);
        driver.navigate().to("https://www.google.com/");
         driver.navigate().back();
         String shopperurl=driver.getCurrentUrl();
        assert(url.equals(shopperurl));
         driver.close();
    }
}
