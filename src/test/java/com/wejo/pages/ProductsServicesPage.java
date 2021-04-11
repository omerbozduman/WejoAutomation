package com.wejo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ProductsServicesPage extends BasePage {

    @FindBy(css = ".product-lead-title")
    public WebElement pageSubTitle;

    @FindBy(css = ".product-tile-title")
    public List<WebElement> listOfProduct;

    public List<String> getActualProductList(){

        List<String> actualProductList= new ArrayList<>();

        for (WebElement productElement : listOfProduct) {
            actualProductList.add(productElement.getText());
        }

        return actualProductList;
    }

}
