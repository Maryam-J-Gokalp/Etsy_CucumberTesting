package com.etsy.step_definitions;

import com.etsy.pages.EtsyHomePage;
import com.etsy.utilities.BrowserUtils;
import com.etsy.utilities.ConfigurationReader;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp_StepDef {

    EtsyHomePage etsyHomePage = new EtsyHomePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user in on the etsy home page")
    public void user_in_on_the_etsy_home_page() {

        Driver.getDriver().manage().deleteAllCookies();

        Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));

    }
    @When("user clicks the sign in button")
    public void user_clicks_the_sign_in_button() {

        etsyHomePage.signInButton.click();

    }
    @When("user enters the email address into the email box")
    public void user_enters_the_email_address_into_the_email_box() {

        etsyHomePage.emailAddressBox.sendKeys(ConfigurationReader.getProperty("email"));

    }
    @When("user click the continue button")
    public void user_click_the_continue_button() {

        etsyHomePage.continueButton.click();

        wait.until(ExpectedConditions.visibilityOf(etsyHomePage.firstNameBox));

    }
    @When("user enters the firstname into the firstname box")
    public void user_enters_the_firstname_into_the_firstname_box() {

        etsyHomePage.firstNameBox.sendKeys(ConfigurationReader.getProperty("name"));

    }
    @When("user enters the password into the password box")
    public void user_enters_the_password_into_the_password_box() {

        etsyHomePage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

    }
    @When("user clicks the register button")
    public void user_clicks_the_register_button() {

        etsyHomePage.registerButton.click();

    }
    @Then("user should see the etsy homepage")
    public void user_should_see_the_etsy_homepage() {

        String expectedName = ConfigurationReader.getProperty("name");
        String actualName = BrowserUtils.getText();

        Assert.assertTrue(expectedName.contains(actualName));


    }
}
