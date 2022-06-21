package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomePage {

    public EtsyHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//header[@id='gnav-header-inner']//li//button")
    public WebElement signInButton;

    @FindBy(id = "join_neu_email_field")
    public WebElement emailAddressBox;

    @FindBy(xpath = "//button[@name='submit_attempt']")
    public WebElement continueButton;

    @FindBy(id = "join_neu_first_name_field")
    public WebElement firstNameBox;

    @FindBy(id = "join_neu_password_field")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@name='submit_attempt']")
    public WebElement registerButton;



}
