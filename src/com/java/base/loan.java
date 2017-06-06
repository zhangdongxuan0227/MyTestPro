package com.java.base;
import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by Administrator on 2017/5/22.
 */
public class loan {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://10.10.21.71:8080/sso/login?service=http%3A%2F%2F10.10.23.97%3A8097%2Fminin-loan%2Fcallback%3Fclient_name%3DCasClient");
        driver.findElement(By.id("username")).sendKeys("minxin");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.name("submit")).click();

//        driver.quit();
    }
}
