package step_definitions;

import cucumber.api.java.en.Then;
import org.example.pageObject.CheckoutComPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutComSteps {

    private WebDriver webDriver;

    public CheckoutComSteps () {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User finish checktout")
    public void verifyFinishCheckout () {
        CheckoutComPage comPage = new CheckoutComPage(webDriver);
        Assert.assertTrue(comPage.verifyCheckoutComplete());
    }
}
