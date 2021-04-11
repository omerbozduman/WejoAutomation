package com.wejo.pages;

import com.wejo.utilities.BrowserUtils;
import com.wejo.utilities.ConfigurationReader;
import com.wejo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    @FindBy(xpath = "//a[@aria-label='dismiss cookie message']")
    public WebElement acceptCookies;

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void openWejo(){
        Driver.get().get(ConfigurationReader.get("url"));
    }

    public String getPageTitle() {
        return Driver.get().getTitle();
    }

    public void navigateToModule(String module) {
        String moduleLocator;
        if(module.contains("Products")){

            moduleLocator="//div[contains(text(),'Services')]";
        }else {
            moduleLocator = "//*[contains(text(),'" + module + "')]";
        }

        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)),  5);
        }
    }


}
