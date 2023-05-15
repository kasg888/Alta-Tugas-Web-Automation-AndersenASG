package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.YourCartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class YourCartSteps {

    private WebDriver webDriver;

    public YourCartSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on Your Cart page")
    public void verifyYourCartPage () {
        YourCartPage yourCartPage = new YourCartPage(webDriver);
        Assert.assertTrue(yourCartPage.verifyYourCart());
    }

    @When("User adjusting items in cart")
    public void removingItem () {
        YourCartPage yourCartPage = new YourCartPage(webDriver);
        yourCartPage.removeItemRed();
        yourCartPage.clickCheckout();
    }

}
