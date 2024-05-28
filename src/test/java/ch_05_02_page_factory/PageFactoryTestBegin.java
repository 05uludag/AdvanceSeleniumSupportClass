package ch_05_02_page_factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageFactoryTestBegin {

    WebDriver driver;

    @BeforeEach
    public void createDriver(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://eviltester.github.io/supportclasses/#2000");

    }

    @Test
    public void sendMessage(){

        SupportClassesPageBegin page = new SupportClassesPageBegin(driver);

        page.singleResendButton.click();

        //Assertions.assertEquals("Received message: selected 1",
        // page.message.getText());
    }

    // the default most people use for handling timeout issues with
    // page factory is implicit waits



    @AfterEach
    public void closeDriver(){
        driver.quit();
    }
}