package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JsAlert extends TestBase {
    @Test
    public void testjSAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement button= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        button.click();

        String alertMesaji=driver.switchTo().alert().getText();
        System.out.println(alertMesaji);
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
    @Test
    public void jSConfirm() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement button= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        button.click();

        String mesaj=driver.switchTo().alert().getText();
        System.out.println(mesaj);
        Thread.sleep(3000);
        //reddetmek icin
        driver.switchTo().alert().dismiss();
        //kabul etmek icin

        //  driver.switchTo().alert().accept();
    }
    @Test
    public void jSConfirmSend() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        button.click();

        String mesaj=driver.switchTo().alert().getText();
        System.out.println(mesaj);
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Merhaba TestNG");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

    }
}




