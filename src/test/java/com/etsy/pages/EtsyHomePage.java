package com.etsy.pages;

import com.etsy.utilities.ConfigurationReader;
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

    @FindBy(xpath = "//input[@id='join_neu_first_name_field']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='join_neu_password_field']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@name='submit_attempt']")
    public WebElement registerButton;

    @FindBy(id = "join-neu-form")
    public WebElement form;


    //MENUS

    @FindBy(id = "catnav-primary-link-10855")
    public WebElement jeweleryAndAccessories;

    @FindBy(id = "catnav-primary-link-10923")
    public WebElement clothingAndShoes;

    @FindBy(id = "catnav-primary-link-891")
    public WebElement homeAndLiving;

    @FindBy(id = "catnav-primary-link-10983")
    public WebElement weddingAndParty;

    @FindBy(id = "catnav-primary-link-11049")
    public WebElement toysAndEntertainment;

    @FindBy(id = "catnav-primary-link-66")
    public WebElement artAndCollectibles;

    @FindBy(id = "catnav-primary-link-562")
    public WebElement craftSuppliesAndTools;

    @FindBy(xpath = "//span[.='Vintage']")
    public WebElement vintage;



}
