package com.solvd.webautomationtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.datatype.Duration;

public class YahooHomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id='ybarAccountMenuOpener']/span")
    private ExtendedWebElement accountMenu;

    @FindBy(xpath = "//*[@id='ybarAccountMenuBody']/a[5]")
    private ExtendedWebElement accountSetting;

    public YahooHomePage(WebDriver driver) {
        super(driver);
    }

    public YahooPersonalInfoEditPage accountSettings(){
        Actions actions = new Actions(driver);
        actions.moveToElement(accountMenu.getElement()).perform();
        accountSetting.click();
        return new YahooPersonalInfoEditPage(driver);
    }
}
