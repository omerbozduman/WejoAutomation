package com.wejo.pages;

import com.wejo.utilities.ConfigurationReader;
import com.wejo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WhyWejoPage extends BasePage {

    @FindBy(css=".wmr-form-lead")
    public WebElement startYourJourneyMessage;

    @FindBy(id="Name-2")
    public WebElement nameBox;

    @FindBy(id="Company-2")
    public WebElement companyBox;

    @FindBy(id="Email-2")
    public WebElement emailBox;

    @FindBy(id="submit")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='form-success w-form-done']")
    public WebElement formSuccessMessage;


    public void clickSubModule(String subModule){

        String locator= "//a[contains(text(),'"+subModule+"')]";
        WebElement subModuleElement= Driver.get().findElement(By.xpath(locator));
        subModuleElement.click();
    }

    public void fillStartYourJourneyForm(){
        nameBox.sendKeys(ConfigurationReader.get("name"));
        companyBox.sendKeys(ConfigurationReader.get("company"));
        emailBox.sendKeys(ConfigurationReader.get("email"));
    }





    }


