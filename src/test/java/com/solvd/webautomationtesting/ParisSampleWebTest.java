package com.solvd.webautomationtesting;


import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParisSampleWebTest implements IAbstractTest {


    @Test
    public void testYahooLogin(){
        System.setProperty("web-driver.chrome.driver", "/Users/parisamory/Documents/chromedriver_mac64/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        YahooLoginPage yahooLoginPage = new YahooLoginPage(chromeDriver);
        yahooLoginPage.navigateToYahooHomePage();
        yahooLoginPage.clickSignInButton();
        yahooLoginPage.typeUsername();
        Assert.assertTrue(yahooLoginPage.isPageOpened(), "Yahoo login page is not opened");

        YahooPasswordPage yahooPasswordPage = new YahooPasswordPage(chromeDriver);
        yahooPasswordPage.typePassword();
        Assert.assertTrue(yahooPasswordPage.isPageOpened(), "Yahoo password page is not opened");


        YahooHomePage yahooHomePage = new YahooHomePage(chromeDriver);
        yahooHomePage.accountSettings();
        Assert.assertTrue(yahooHomePage.isPageOpened(), "Yahoo home page is not opened");


        YahooPersonalInfoEditPage yahooPersonalInfoEditPage = new YahooPersonalInfoEditPage(chromeDriver);
        yahooPersonalInfoEditPage.clickEditButton();
        Assert.assertTrue(yahooPersonalInfoEditPage.isPageOpened(), "Yahoo personal info edit page is not opened");


        YahooChangePersonalInfoPage yahooChangePersonalInfoPage = new YahooChangePersonalInfoPage(chromeDriver);
        yahooChangePersonalInfoPage.changeFirstName();
        yahooChangePersonalInfoPage.changeLastName();
        Assert.assertTrue(yahooChangePersonalInfoPage.isPageOpened(), "Yahoo change personal info page is not opened");


        YahooDoneWithPersonalInfoPage yahooDoneWithPersonalInfoPage = new YahooDoneWithPersonalInfoPage(chromeDriver);
        yahooDoneWithPersonalInfoPage.doneChangingInfo();
        Assert.assertTrue(yahooDoneWithPersonalInfoPage.isPageOpened(), "Yahoo done with personal info page is not opened");


        YahooSignOutPage yahooSignOutPage = new YahooSignOutPage(chromeDriver);
        yahooSignOutPage.signOut();
        Assert.assertTrue(yahooSignOutPage.isPageOpened(), "Yahoo sign out page is not opened");

    }





}
