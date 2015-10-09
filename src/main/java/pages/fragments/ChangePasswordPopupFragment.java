package pages.fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.UserProfilePage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Roman_Tretyak on 6/2/2015.
 */
public class ChangePasswordPopupFragment extends UserProfilePage {

    @FindBy(xpath = "//a[contains(@class, 'fancybox-close')]")
    private WebElement btnClosePopup;

    @FindBy(className = "dialog-title-left")
    private WebElement lblPopupHeader;

    @FindBy(id = "changePasswordold")
    private WebElement txtPasswordOld;

    @FindBy(id = "changePasswordnew")
    private WebElement txtPasswordNew;

    @FindBy(id = "changePasswordconfirm")
    private WebElement txtPasswordConfirm;

    @FindBy(xpath = "//label[@class = 'error']")
    private List<WebElement> listErrorsChangePass;

    @FindBy(id = "changePasswordSubmit")
    private WebElement btnSave;

    public ChangePasswordPopupFragment(WebDriver webDriver) {
        super(webDriver);
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public boolean validateChangePasswordPopup(){
        return lblPopupHeader.isDisplayed();
    }

    public void clickSave(){
        btnSave.click();
    }

    public List<String> getChangePassErrors()
    {
        List<String> list = new ArrayList();
        for(WebElement webElement : listErrorsChangePass){
            list.add(webElement.getText());
        }
        return list;
    }

    public void changePassword(String pass, String newPass, String confirmPass){
        txtPasswordOld.sendKeys(pass);
        txtPasswordNew.sendKeys(newPass);
        txtPasswordConfirm.sendKeys(confirmPass);
    }
}
