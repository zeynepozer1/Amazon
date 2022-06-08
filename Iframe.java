package com.infoTech.tests;


import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe extends TestBase {

    @Test
    public void iframeTest1() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/iframe");
        //1-index ile gecis yapma
        driver.switchTo().frame(0);
        //paragraf kisminin Webelementini aldim
        WebElement paragraf = driver.findElement(By.xpath("//p"));
        paragraf.clear();
        Thread.sleep(3000);
        paragraf.sendKeys("index ile selamlama");

    }

    @Test
    public void iframeTest2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");

        WebElement paragraf=driver.findElement(By.xpath("//p"));
        paragraf.clear();
        Thread.sleep(3000);
        paragraf.sendKeys("id value ile selamlama");
    }
    @Test
    public void iframeTest3() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement iframe=driver.findElement(By.id("mce_0_ifr"));
        driver.get("https://the-internet.herokuapp.com/iframe");


        //buldugumuz webelementle asagida gecis yapiyoruz "IFRAME" gecis yaptik
        driver.switchTo().frame(iframe);

        Thread.sleep(3000);
        WebElement paragraf=driver.findElement(By.xpath("//p"));
        paragraf.clear();
        Thread.sleep(3000);
        paragraf.sendKeys("id ve value ile selamlama");
    }
}