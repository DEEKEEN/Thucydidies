package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;


/**
 * Created by Roman_Tretyak on 8/4/2015.
 */
@DefaultUrl("/")
public class GmailLoginPage  extends PageObject {
    @FindBy(how = How.ID, using = "Email")
    private WebElement emailInputField;

    @FindBy(how = How.ID, using = "next")
    private WebElement nextEmailButton;

    @FindBy(how = How.ID, using = "Passwd")
    private WebElement passwordInputField;

    @FindBy(how = How.ID, using = "signIn")
    private WebElement signInButton;

    public GmailLoginPage(WebDriver webDriver) {
        super(webDriver);
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public GmailLoginPage setEmail(String email){
        emailInputField.sendKeys(email);
        return this;
    }

    public GmailLoginPage clickNextButton(){
        nextEmailButton.click();
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return this;
    }

    public GmailLoginPage setPassword(String password){
        passwordInputField.sendKeys(password);
        return this;
    }

    public GmailLoginPage signIn(){
        signInButton.click();
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return this;
    }
}
