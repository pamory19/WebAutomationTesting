package com.solvd.webautomationtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YahooChangePersonalInfoPage extends AbstractPage {

    @FindBy(id = "updated-first-name")
    private ExtendedWebElement updatedFirstName;

    @FindBy(id = "updated-last-name")
    private ExtendedWebElement updatedLastName;

    public YahooChangePersonalInfoPage(WebDriver driver) {
        super(driver);
    }

    public YahooChangePersonalInfoPage changeFirstName() {
        updatedFirstName.click();
        updatedFirstName.sendKeys(Keys.valueOf(Keys.chord(Keys.COMMAND, "a")));
        updatedFirstName.sendKeys(Keys.DELETE);
        updatedFirstName.type("Test103243");
        return new YahooChangePersonalInfoPage(driver);
    }

    public YahooChangePersonalInfoPage changeLastName() {
        updatedLastName.click();
        updatedLastName.sendKeys(Keys.valueOf(Keys.chord(Keys.COMMAND, "a")));
        updatedLastName.sendKeys(Keys.DELETE);
        updatedLastName.type("User103243");
        return new YahooChangePersonalInfoPage(driver);
    }

}
