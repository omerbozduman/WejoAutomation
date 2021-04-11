package com.wejo.step_definitions;

import com.wejo.pages.HomePage;
import com.wejo.utilities.BrowserUtils;
import com.wejo.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class HomePageStepDefs {
    
    Pages pages= new Pages();

    @Given("I open Wejo website")
    public void i_open_wejo_website() {
        pages.homePage().openWejo();
        BrowserUtils.waitForClickablility(pages.homePage().acceptCookies,5);
        pages.homePage().acceptCookies.click();

    }
    

    @Then("I verify page title is {string}")
    public void i_verify_page_title_is(String expectedPageTitle) {

        Assert.assertEquals("verify page title", expectedPageTitle, pages.homePage().getPageTitle());
        
    }
    @Then("I verify below statistics")
    public void i_verify_below_statistics(Map<String,String> stats) {
        System.out.println("stats = " + stats);

        Map<String,String> actualStatistics =pages.homePage().getStats(stats);

        for (String s : stats.keySet()) {

            Assert.assertEquals(stats.get(s),actualStatistics.get(s));

        }

    }
}
