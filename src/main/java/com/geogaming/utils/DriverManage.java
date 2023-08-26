package com.geogaming.utils;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.time.Duration;

public class DriverManage {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver() {
        return driver.get();
    }
    public void setDriver(WebDriver driver1) {
        driver.set(driver1);
    }
    public void initializeDriver() throws Exception {
        WebDriver driver = null;
        GlobalParams params = new GlobalParams();
        ChromeOptions options = new ChromeOptions();


        if (driver == null) {
            try {
                switch (params.getBrowserName()) {
                    case "Chrome":
                        options.addArguments("--incognito");
                        options.setAcceptInsecureCerts(true);
                        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
                        DesiredCapabilities caps = new DesiredCapabilities();
                        caps.setCapability(ChromeOptions.CAPABILITY, options);
                        options.merge(caps);
                        driver = new ChromeDriver(options);
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;
                    case "FireFox":
                        break;

                }
                if (driver == null) {
                    throw new Exception("driver is null. ABORT!!!");
                }

                this.driver.set(driver);
            } catch (IOException e) {
                e.printStackTrace();

            }
        }

    }


}
