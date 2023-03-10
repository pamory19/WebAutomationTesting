package com.solvd.webautomationtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class YahooSignOutPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"ybarAccountMenuOpener\"]")
    private ExtendedWebElement accountMenu;

    @FindBy(xpath = "//*[@id=\"profile-signout-link\"]/span[2]")
    private ExtendedWebElement signOutButton;


    public YahooSignOutPage(WebDriver driver) {
        super(driver);
    }

    public YahooLoginPage signOut(){
        Actions actions = new Actions(driver);
        actions.moveToElement(accountMenu.getElement()).perform();
        signOutButton.click();
        return new YahooLoginPage(driver);
    }
}
