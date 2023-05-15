package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SalesPage {

    public static WebDriver driver;

    public SalesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifySalesPage;

    public  boolean verifySalesPage(){
        return verifySalesPage.isDisplayed();
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement FilterSalesPage;

    public void filterSalesPage () {
        Select select = new Select(FilterSalesPage);
        select.selectByValue("za");
    }

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement btnAtcred;

    public void clicktshirtred () {
        btnAtcred.click();
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement btnAtconesie;

    public void clickonesie () {
        btnAtconesie.click();
    }

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement btnCart;

    public void clickCart () {
        btnCart.click();
    }

}
