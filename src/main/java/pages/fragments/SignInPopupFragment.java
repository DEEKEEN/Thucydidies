package pages.fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.LandingPage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Roman_Tretyak on 5/20/2015.
 */
public class SignInPopupFragment extends LandingPage{


    @FindBy(id = "loginusername")
    WebElement txtUserName;

    @FindBy(id = "loginpassword")
    WebElement txtPasswordSignIn;
//
//    [FindsBy(How = How.Id, Using = "forgotpasswordLink")]
//    private IWebElement btnForgorPassword;
//
//    [FindsBy(How = How.Id, Using = "user-signin-cancel")]
//    private IWebElement btnCancelSingIn;

    @FindBy(id = "UsersignIn")
    WebElement btnSingIn;

    @FindBy(xpath = "//label[@class = 'error']")
    List<WebElement> listErrorsSignIn;

//    [FindsBy(How = How.Id, Using = "logoutOk")]
//    private IWebElement btnYesButton;
    public SignInPopupFragment(WebDriver webDriver) {
        super(webDriver);
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void clickSignIn(){
        btnSingIn.click();
    }

    public void setPassword(String pass){
        txtPasswordSignIn.sendKeys(pass);
    }

    public void setTxtUserName(String userName){
        txtUserName.sendKeys(userName);
    }

    public List<String> getSignInErrors()
    {
        List<String> list = new ArrayList();
        for(WebElement webElement : listErrorsSignIn){
            list.add(webElement.getText());
        }
        return list;
    }
}
