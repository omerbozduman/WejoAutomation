package com.wejo.step_definitions;

import com.wejo.pages.WhyWejoPage;
import com.wejo.utilities.BrowserUtils;
import com.wejo.utilities.Driver;
import com.wejo.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;

public class WhyWejoStepDefs {

    Pages pages = new Pages();

    @Then("I click {string} submodule under {string} module")
    public void i_click_submodule_under_module(String subModule, String module) {
        pages.whyWejoPage().navigateToModule(module);
        pages.whyWejoPage().clickSubModule(subModule);
    }

    @Then("I verify {string} is displayed")
    public void i_verify_is_displayed(String expectedMessage) {
        String actualMessage= pages.whyWejoPage().startYourJourneyMessage.getText();
        Assert.assertEquals("verify form message", expectedMessage,actualMessage);
    }
    @Then("I fill the form with valid data")
    public void i_fill_the_form_with_valid_data() {

        pages.whyWejoPage().fillStartYourJourneyForm();
    }
    @And("I click the Submit button")
    public void iClickTheSubmitButton() throws IOException {

        pages.whyWejoPage().submitButton.click();

    }

    @Then("I verify form success message {string} is displayed")
    public void iVerifyFormSuccessMessageIsDisplayed(String expectedMessage) {
        BrowserUtils.waitForVisibility(pages.whyWejoPage().formSuccessMessage,5);
        String actualMessage= pages.whyWejoPage().formSuccessMessage.getText();
        Assert.assertEquals("verify form submit message",expectedMessage,actualMessage);
    }


}
