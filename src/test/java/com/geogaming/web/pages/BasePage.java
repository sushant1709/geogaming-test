package com.geogaming.web.pages;

import com.geogaming.utils.DriverManager;
import com.geogaming.utils.GlobalParams;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;

    GlobalParams params = new GlobalParams();
    public static final Duration TIME = Duration.ofSeconds(30);

    public BasePage() {
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(driver, this);
    }
    public void waitForClickable(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, TIME);
        wait.until(ExpectedConditions.elementToBeClickable(e));

    }
    public WebElement visibilityOfElement(WebElement e) {

        return new WebDriverWait(driver, TIME)
                .until(ExpectedConditions.visibilityOf(e));
    }
    public void Sleep(int sec) {
        try {
            Thread.sleep(1000L * sec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void click(WebElement e) {
        waitForClickable(e);
        e.click();
    }

    public String getText(WebElement e) {
        return visibilityOfElement(e).getText();
    }

    public void clear(WebElement e) {
        waitForClickable(e);
        e.clear();
    }

    public void sendKeys(WebElement e, String txt) {
        waitForClickable(e);
        e.sendKeys(txt);
    }

}
