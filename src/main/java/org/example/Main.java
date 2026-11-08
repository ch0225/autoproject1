package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ממלאים פרטים נכונים
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automation.co.il/tutorials/selenium/demo1/indexID.html");
        driver.findElement(By.id("firstname")).sendKeys("chaya");
        driver.findElement(By.id("lastname")).sendKeys("kerbel");
        driver.findElement(By.id("email")).sendKeys("ch@ke.com");
        driver.findElement(By.id("next")).click();
        driver.findElement(By.id("Beginner")).click();
        driver.findElement(By.id("next")).click();
        driver.findElement(By.id("streetname")).sendKeys("chazon david");
        driver.findElement(By.id("streetnumber")).sendKeys("7");
        driver.findElement(By.id("city")).sendKeys("modiyin elit");
        driver.findElement(By.id("country")).sendKeys("israel");
        driver.findElement(By.id("finish")).click();
        driver.findElement(By.id("finish")).click();

        driver.quit();

    }
}