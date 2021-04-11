package com.wejo.step_definitions;

import com.wejo.pages.ProductsServicesPage;
import com.wejo.utilities.Pages;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ProductsServicesPageStepDefs {

    Pages pages = new Pages();

    @Then("I verify page sub title {string} is displayed")
    public void i_verify_page_sub_title_is_displayed(String expectedSubTitle) {
        String actualSubTitle= pages.productsServicesPage().pageSubTitle.getText();

        Assert.assertEquals("verify page sub title", expectedSubTitle,actualSubTitle);
    }


    @Then("I verify below product are displayed")
    public void i_verify_below_product_are_displayed(List<String> products) {

        for (String product : products) {
            Assert.assertTrue("verify products",pages.productsServicesPage().getActualProductList().contains(product));

        }

    }
}
