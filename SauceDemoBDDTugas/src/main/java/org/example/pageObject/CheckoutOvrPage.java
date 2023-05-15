package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchService;
import java.util.List;

public class CheckoutOvrPage {

    public static WebDriver driver;

    public CheckoutOvrPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

//            @FindBy(className = "summary_subtotal_label"),

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement subTotal;

    public boolean verifySubTotal () {
        return subTotal.isDisplayed();
    }

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;

    public void clickFinish () {
        btnFinish.click();
    }

}
