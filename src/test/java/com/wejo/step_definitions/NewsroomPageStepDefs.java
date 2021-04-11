package com.wejo.step_definitions;

import com.wejo.utilities.Pages;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NewsroomPageStepDefs {

    Pages pages = new Pages();

    @Then("I navigate to {string} module")
    public void i_navigate_to_module(String module) {
        pages.newsroomPage().navigateToModule(module);
    }


    @Then("I click the sub module {string}")
    public void iClickTheSubModule(String subModule) {
        pages.newsroomPage().navigateToSubModule(subModule);
    }

    @Then("I click the first blog")
    public void i_click_the_first_blog() {
        pages.newsroomPage().clickTheFirstBlog();
    }

    @Then("I verify {string} text is displayed")
    public void i_verify_text_is_displayed(String expectedText) {
        String actualText= pages.newsroomPage().getShareText();

        Assert.assertEquals("verify share link text", expectedText,actualText);
    }
    @Then("I verify {string} links")
    public void i_verify_links(String socialMediaLinks) {

        Assert.assertTrue("verify social media links",pages.newsroomPage().verifySocialMedaiLinks(socialMediaLinks));
    }


}
