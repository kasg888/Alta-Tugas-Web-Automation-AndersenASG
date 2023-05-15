package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutYiPage {

    public static WebDriver driver;

    public CheckoutYiPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement CheckoutYiTitle;

    public boolean verifyCheckout () {
        return CheckoutYiTitle.isDisplayed();
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement FirstName;

    public void setFirstName (String firstName) {
        FirstName.sendKeys(firstName);
    }

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement LastName;

    public void setLastName (String lastName) {
        LastName.sendKeys(lastName);
    }

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement ZipCode;

    public void setZipCode (String zipCode) {
        ZipCode.sendKeys(zipCode);
    }

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;

    public void clickContinue () {
        btnContinue.click();
    }

}
