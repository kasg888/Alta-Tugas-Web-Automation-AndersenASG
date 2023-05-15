package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {

    public static WebDriver driver;

    public YourCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement YourCartTitle;

    public boolean verifyYourCart () {
        return YourCartTitle.isDisplayed();
    }

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement rmvRed;

    public void removeItemRed () {
        rmvRed.click();
    }

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckout;

    public void clickCheckout () {
        btnCheckout.click();
    }

}
