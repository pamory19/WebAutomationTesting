package com.solvd.webautomationtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YahooPersonalInfoEditPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"group-personal-title\"]/a[2]")
    private ExtendedWebElement editButton;

    public YahooPersonalInfoEditPage(WebDriver driver) {
        super(driver);
    }

    public YahooChangePersonalInfoPage clickEditButton(){
        editButton.click();
        return new YahooChangePersonalInfoPage(driver);
    }
}
