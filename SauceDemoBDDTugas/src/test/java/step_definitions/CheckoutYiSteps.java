package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CheckoutYiPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutYiSteps {

    private WebDriver webDriver;

    public CheckoutYiSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on checkout your information page")
    public void verifyCheckoutYiPage () {
        CheckoutYiPage checkoutYiPage = new CheckoutYiPage(webDriver);
        Assert.assertTrue(checkoutYiPage.verifyCheckout());
    }

    @When("User input first name \"(.*)\" and last name \"(.*)\" then the zip code \"(.*)\"")
    public void inputCheckoutInfo (String firstname, String lastname, String zipcode) {
        CheckoutYiPage checkoutYiPage = new CheckoutYiPage(webDriver);
        checkoutYiPage.setFirstName(firstname);
        checkoutYiPage.setLastName(lastname);
        checkoutYiPage.setZipCode(zipcode);
        checkoutYiPage.clickContinue();
    }

}
