package com.hillel.homework22.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {

    private WebDriverFactory(){};

    public static WebDriver getByName(BrowserName browserName){
        switch (browserName){
            case EDGE :
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver");
                return new EdgeDriver();
            case CHROME :
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
                return new ChromeDriver();
            default:
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver");
                return new EdgeDriver();
        }
    }
}
