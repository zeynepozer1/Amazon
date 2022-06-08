package com.infoTech.tests;

import com.infoTech.pages.AmazonPage;
import com.infoTech.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AmazonTest extends TestBase {

    @Test(groups = {"amazon","login"})
    public void amazonArama(){
        driver.get("http://amazon.com");

        AmazonPage page=new AmazonPage(driver);
        page.amazonArama.sendKeys("Baby stroller"+ Keys.ENTER);

    }
}