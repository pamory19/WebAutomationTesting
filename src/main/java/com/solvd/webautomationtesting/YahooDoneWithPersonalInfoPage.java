package com.solvd.webautomationtesting;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YahooDoneWithPersonalInfoPage extends AbstractPage {

    @FindBy(xpath = "//*[@id='group-personal-title']/a[1]")
    private ExtendedWebElement doneButton;

    public YahooDoneWithPersonalInfoPage(WebDriver driver) {
        super(driver);
    }

    public void doneChangingInfo(){
        doneButton.click();
    }
}
