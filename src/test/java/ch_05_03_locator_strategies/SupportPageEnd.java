package ch_05_03_locator_strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class SupportPageEnd extends PageFactory {
    private final WebDriver driver;

    @FindBy(how = How.ID, using = "resend-select")
    public WebElement singleResendButton;

    @FindBy(how = How.CSS, using = "#message")
    public WebElement message;

    public SupportPageEnd(WebDriver driver){

        this.driver = driver;
        //initElements(new AjaxElementLocatorFactory(driver, 10),
        //        this);
        initElements(new AjaxElementFactory(driver, 10),
                this);

    }


    public String waitForMessage(){


        return message.getText();
    }
}
