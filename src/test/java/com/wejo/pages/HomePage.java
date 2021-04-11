package com.wejo.pages;

import com.wejo.utilities.BrowserUtils;
import com.wejo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class HomePage extends BasePage{

    public Map<String,String> getStats(Map<String,String> stats){

        BrowserUtils.waitFor(3);

        Map<String,String > actualStats= new HashMap<>();

        for (String key : stats.keySet()) {
            System.out.println("stats = " + stats.keySet());
            String keyLocator="//div[contains(text(),'"+key+"')]";
            WebElement keyElement= Driver.get().findElement(By.xpath(keyLocator));

            String statLocator="//div[contains(text(),'"+key+"')]/../h2";
            WebElement statElement= Driver.get().findElement(By.xpath(statLocator));

            String unitLocator = "//div[contains(text(),'"+key+"')]/../h2/following-sibling::div";
            WebElement unitElement = Driver.get().findElement(By.xpath(unitLocator));

            String statistic= statElement.getText().substring(0,1).toUpperCase()+statElement.getText().substring(1).toLowerCase()
                    +" " + unitElement.getText().substring(0,1).toUpperCase()+unitElement.getText().substring(1).toLowerCase();

            String actualKey= keyElement.getText().substring(0,1).toUpperCase()+keyElement.getText().substring(1).toLowerCase();
            actualStats.put(actualKey,statistic);
        }

        return actualStats;


    }

}
