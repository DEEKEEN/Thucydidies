package pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by Roman on 12.05.2015.
 */
public class LandingPage extends PageObject {

    @FindBy(id = "userNameLink")
    WebElement btnuUserNameLink;

    @FindBy(id = "registerUser")
    WebElement btnRegister;

    @FindBy(xpath = "//li[@id='help']/a")
    WebElement btnHelp;

    @FindBy(id = "LP-LiveChat")
    WebElement btnLiveChat;

    @FindBy(id = "LP-EmailSupport")
    WebElement btnEmailSupport;

    @FindBy(className = "button-login")
    WebElement lnkSignIn;

    @FindBy(id = "signOutLink")
    WebElement lnkSignOut;

    @FindBy(xpath = "//ul[@id='cartSummary']//img")
    WebElement imgShoppingCart;

    @FindBy(id = "CartDetails")
    WebElement btnCart;

    @FindBy(id = "slides-nxt-icon")
    WebElement btnSlidesNext;

    @FindBy(id = "slides-prev-icon")
    WebElement btnSlidesPrev;

    @FindBy(id = "CartItemCount")
    WebElement cntCartItemCount;

    @FindBy(xpath = "//a[@class = 'logo']/img")
    WebElement imgLogo;

    @FindBy(id = "userNameLink")
    WebElement cntUserName;

    @FindBy(xpath = "//ul[@id='divLoginButton']/li[@class]']")
    WebElement lblClerkName;

    @FindBy(className = "viewInboxLink")
    WebElement lnkInbox;

    @FindBy(id = "InboxItemsCount")
    WebElement cntInboxItemCount;

    @FindBy(id = "viewInboxItemsBubble")
    WebElement cntViewInboxItems;

    @FindBy(className = "error")
    List<WebElement> listErrors;

    @FindBy(xpath = "//div[@class ='dialog-title-left']")
    WebElement cntpopupHeader;

    @FindBy(xpath = "//a[contains(@class, 'fancybox-close')]")
    WebElement btnClosePopup;


    public LandingPage(WebDriver webDriver) {
        super(webDriver);
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void signIn(){
        lnkSignIn.click();
    }

    public String getLoggedUserName()
    {
        return cntUserName.getText();
    }

        public void clickOnUserName()
    {
        btnuUserNameLink.click();
    }
//
// public void checkMessage() {
//        important.click();
//    }
//
//
//    public HomePage ClickOnMenuTab(String tabName)
//    {
//        var menu = GetMenuItemText();
//
//        for (int i=0; i<listSlides.Count; i++)
//        {
//            if (menu[i].Equals(tabName))
//            {
//                CheckAndClickOnMenuTab(listSlides[i]);
//                //listSlides[i].Click();
//
//                WaitEndOfAjaxCall();
//                break;
//            }
//        }
//        return this;
//    }
//
//    public HomePage CheckAndClickOnMenuTab(IWebElement menu)
//    {
//        if (menu.Displayed)
//        {
//            menu.Click();
//        }
//        else
//        {
//            if (btnSlidesNext.Displayed)
//            {
//                btnSlidesNext.Click();
//                btnSlidesNext.Click();
//                CheckAndClickOnMenuTab(menu);
//            }
//        }
//
//        return this;
//    }
//
//    public String GetCurrentMenuName()
//    {
//        return ctnCurrentSlide.GetText();
//    }
//
//    public HomePage ClickLinkSignIn()
//    {
//        lnkSignIn.Click();
//        return this;
//    }
//
//    public HomePage ClickLinkSignOut()
//    {
//        lnkSignOut.Click();
//        return this;
//    }
//
//    public HomePage ClickLinkRegister()
//    {
//        btnRegister.Click();
//
//        return this;
//    }
//
//    public bool IsUserNoLogin()
//    {
//        return lnkSignIn.IsElementVisible() && !lnkSignOut.IsElementVisible();
//
//    }
//
//    public String GetLoggedUserName()
//    {
//        return cntUserName.Text;
//    }
//
//    public ArrayList GetErrors()
//    {
//        ArrayList list = new ArrayList();
//        foreach (IWebElement element in listErrors)
//        {
//            if (!element.Text.Equals(""))
//            {
//                list.Add(element.Text);
//            }
//
//        }
//        return list;
//    }
//
//    public bool IsPopupVisible()
//    {
//        return cntpopupHeader.IsElementVisible();
//    }
//
//    public String GetPopupHeader()
//    {
//        return cntpopupHeader.Text;
//    }
//
//    public void ClosePopup()
//    {
//        btnClosePopup.Click();
//        WaitForHidingPopupBackground();
//    }
//
//    public int GetCartItemCount()
//    {
//        WaitEndOfAjaxCall();
//        WaitEndOfAjaxCall();
//        return Convert.ToInt32(cntCartItemCount.Text);
//    }
//

//
//    public HomePage ClickButtonCart()
//    {
//        btnCart.Click();
//        return this;
//    }
//
//    public String GetClerkName()
//    {
//        return lblClerkName.GetText();
//    }
//
//    public int GetInboxItemCount()
//    {
//        WaitEndOfAjaxCall();
//        WaitEndOfAjaxCall();
//        return Convert.ToInt32(cntInboxItemCount.Text);
//    }
//
//    public HomePage ClickButtonInbox()
//    {
//        lnkInbox.Click();
//        return this;
}

