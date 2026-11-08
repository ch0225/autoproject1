package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class errors {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automation.co.il/tutorials/selenium/demo1/indexID.html");
        //ממלאים פרטים עם שגיאות
        driver.findElement(By.id("firstname")).sendKeys("chaya");
        driver.findElement(By.id("lastname")).sendKeys("kerbel");
        driver.findElement(By.id("email")).sendKeys("ch!@bvbh");
        driver.findElement(By.id("next")).click();

//        String err1=driver.findElement(By.id("lastname-error")).getText();
//        if (err1.equals("Please enter at least 3 characters.")){
//            System.out.println("ההודעה תקינה");
//        }
//        else {
//            System.out.println("ההודעה אינה תקינה");
//        }
//
//
//        String err2=driver.findElement(By.id("email-error")).getText();
//        if (err2.equals("Please enter a valid email address.")){
//            System.out.println("ההודעה תקינה");
//        }
//        else {
//            System.out.println("ההודעה אינה תקינה");
//        }


        //לוודא שהגענו לטאב השני
        driver.findElement(By.id("Beginner")).click();
        driver.findElement(By.id("next")).click();
//        String tub2=driver.findElement(By.className("moving-tab")).getText();
//        if (tub2.equals("Account")){
//            System.out.println("לא הגעת לטאב השני:)");
//        }
//        else {
//            System.out.println("הגעת לטאב השני:(");
//        }





//        //לבחור לבל

        driver.findElement(By.id("streetname")).sendKeys("chazon david");
        driver.findElement(By.id("streetnumber")).sendKeys("7");
        driver.findElement(By.id("city")).sendKeys("modiyin elit");
        driver.findElement(By.id("country")).sendKeys("israel");
        driver.findElement(By.id("finish")).click();

        String mess1=driver.findElement(By.className("cta-title")).getText();
        if (mess1.equals("הטופס הזה הוא רק טופס דוגמה")){
            System.out.println("סיימת!");
        }
        else {
            System.out.println("משהו התפקשש---");
        }
        driver.findElement(By.id("finish")).click();

        driver.quit();


    }
}