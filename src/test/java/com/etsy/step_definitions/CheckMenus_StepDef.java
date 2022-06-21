package com.etsy.step_definitions;

import com.etsy.pages.EtsyHomePage;
import com.etsy.utilities.ConfigurationReader;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class CheckMenus_StepDef {

    EtsyHomePage etsyHomePage = new EtsyHomePage();
    Actions actions = new Actions(Driver.getDriver());

    @When("user hover over the {string}")
    public void user_hover_over_the(String string) {

        actions.moveToElement(etsyHomePage.jeweleryAndAccessories).perform();
        actions.moveToElement(etsyHomePage.clothingAndShoes).perform();
        actions.moveToElement(etsyHomePage.homeAndLiving).perform();
        actions.moveToElement(etsyHomePage.weddingAndParty).perform();
        actions.moveToElement(etsyHomePage.toysAndEntertainment).perform();
        actions.moveToElement(etsyHomePage.artAndCollectibles).perform();
        actions.moveToElement(etsyHomePage.craftSuppliesAndTools).perform();

    }

    @Given("user in on the etsy home page")
    public void user_in_on_the_etsy_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));
    }


}
