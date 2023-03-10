package com.solvd.webautomationtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YahooPasswordPage extends AbstractPage {

    @FindBy(id = "login-passwd")
    private ExtendedWebElement passwordLogin;

    @FindBy(id = "login-signin")
    private ExtendedWebElement nextButton;

    public YahooPasswordPage(WebDriver driver) {
        super(driver);
    }

    public YahooHomePage typePassword(){
        passwordLogin.type(Configuration.getEnvArg("yahoopassword"));
        nextButton.click();
        return new YahooHomePage(driver);
    }
}
