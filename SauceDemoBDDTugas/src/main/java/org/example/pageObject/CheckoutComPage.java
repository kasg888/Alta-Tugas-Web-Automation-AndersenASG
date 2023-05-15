package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutComPage {

    public static WebDriver driver;

    public CheckoutComPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//img[@alt='Pony Express']")
    private WebElement CheckoutComplete;

    public boolean verifyCheckoutComplete () {
        return CheckoutComplete.isDisplayed();
    }

}
