package com.wejo.pages;

import com.wejo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class NewsroomPage extends BasePage{

    @FindBy(xpath = "//div[@class='share-text']")
    public WebElement shareText;


    public String subModuleText;

    public void navigateToSubModule(String subModule){

        subModuleText= subModule.substring(0,1).toLowerCase()+subModule.substring(1);

        String locator= "//a[@data-w-tab='"+subModuleText+"']";

        WebElement subModuleElement= Driver.get().findElement(By.xpath(locator));
        subModuleElement.click();
    }

    public void clickTheFirstBlog(){

        String blogLocator ="(//div[@data-w-tab='"+subModuleText+"']/div/div/div/a/div)[2]/h1[@class='cms-tile-headline']";
        WebElement blogElement= Driver.get().findElement(By.xpath(blogLocator));
        blogElement.click();

    }

    public String getShareText(){

        String currentWindow = Driver.get().getWindowHandle();
        Set<String> windowHandles = Driver.get().getWindowHandles();

        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(currentWindow)){
                Driver.get().switchTo().window(windowHandle);
            }
        }
        return shareText.getText();
    }


    public boolean verifySocialMedaiLinks(String socialMedia){

        String[] sm= socialMedia.split(",");
        int mediaLinkCounter=0;
        boolean flag=false;

        for (String s : sm) {
            String locator= "//a[contains(text(),'"+s+"')]";
            WebElement socialElement= Driver.get().findElement(By.xpath(locator));
            if(socialElement.isDisplayed()){
                System.out.println("socialElement.getText() = " + socialElement.getText());
                mediaLinkCounter++;
            }
        }
        if(mediaLinkCounter==sm.length){
            flag=true;
        }
        return flag;

    }
}
