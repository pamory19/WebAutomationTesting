package com.solvd.webautomationtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YahooLoginPage extends AbstractPage {


    @FindBy(xpath = "//*[@id='ybarAccountProfile']/a")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//*[@id='login-username']")
    private ExtendedWebElement loginUsername;

    @FindBy(id = "login-signin")
    private ExtendedWebElement nextButton;

    public YahooLoginPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToYahooHomePage(){
        driver.get(Configuration.getEnvArg("yahoohome"));
    }

    public void clickSignInButton(){
        signInButton.click();
    }

    public YahooPasswordPage typeUsername(){
        loginUsername.type(Configuration.getEnvArg("yahooemail"));
        nextButton.click();
        return new YahooPasswordPage(driver);
    }





}
