package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CheckoutOvrPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutOvrSteps {

    private WebDriver webDriver;

    public CheckoutOvrSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on checkout overview page")
    public void verifyCheckoutPage () {
        CheckoutOvrPage checkoutOvrPage = new CheckoutOvrPage(webDriver);
        Assert.assertTrue(checkoutOvrPage.verifySubTotal());
    }

    @When("User ready to checkout")
    public void finalCheckout () {
        CheckoutOvrPage checkoutOvrPage = new CheckoutOvrPage(webDriver);
        checkoutOvrPage.clickFinish();
    }

}
