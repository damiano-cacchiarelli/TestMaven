package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyWebsiteTest {
    private WebDriver driver;

    @BeforeEach
    void startConfiguration(){
        String projectPath = System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    void checkProsSite() throws InterruptedException {

        driver.get("http://localhost:8080/maven-webapp/");

        Thread.sleep(3000);

        String at = driver.getTitle();
        String et = "SPM 2022";

        Thread.sleep(4000);

        Assertions.assertEquals(et, at);
    }

    @AfterEach
    void endConfiguration(){
        driver.close();
        driver.quit();
    }
}
