package com.solvd.webautomationtesting;


import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParisSampleWebTest implements IAbstractTest {


    @Test
    public void testYahooLogin(){


        YahooLoginPage yahooLoginPage = new YahooLoginPage(getDriver());
        yahooLoginPage.navigateToYahooHomePage();
        Assert.assertTrue(yahooLoginPage.isPageOpened(), "Yahoo login page is not opened");
        yahooLoginPage.clickSignInButton();
        YahooPasswordPage yahooPasswordPage = yahooLoginPage.typeUsername();


        YahooHomePage yahooHomePage = yahooPasswordPage.typePassword();
        Assert.assertTrue(yahooPasswordPage.isPageOpened(), "Yahoo password page is not opened");



        YahooPersonalInfoEditPage yahooPersonalInfoEditPage = yahooHomePage.accountSettings();
        Assert.assertTrue(yahooHomePage.isPageOpened(), "Yahoo home page is not opened");



        YahooChangePersonalInfoPage yahooChangePersonalInfoPage = yahooPersonalInfoEditPage.clickEditButton();
        Assert.assertTrue(yahooPersonalInfoEditPage.isPageOpened(), "Yahoo personal info edit page is not opened");


        yahooChangePersonalInfoPage.changeFirstName();
        yahooChangePersonalInfoPage.changeLastName();
        Assert.assertTrue(yahooChangePersonalInfoPage.isPageOpened(), "Yahoo change personal info page is not opened");


        YahooDoneWithPersonalInfoPage yahooDoneWithPersonalInfoPage = new YahooDoneWithPersonalInfoPage(getDriver());
        yahooDoneWithPersonalInfoPage.doneChangingInfo();
        Assert.assertTrue(yahooDoneWithPersonalInfoPage.isPageOpened(), "Yahoo done with personal info page is not opened");


        YahooSignOutPage yahooSignOutPage = new YahooSignOutPage(getDriver());
        yahooSignOutPage.signOut();
        Assert.assertTrue(yahooSignOutPage.isPageOpened(), "Yahoo sign out page is not opened");

    }





}
