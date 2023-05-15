package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.SalesPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SalesSteps {

    private WebDriver webDriver;

    public SalesSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on sales page")
    public void verifySalesPage() {
        SalesPage salesPage = new SalesPage(webDriver);
        Assert.assertTrue(salesPage.verifySalesPage());
    }

    @When("User choosing items on sales page")
    public void filterPageztoa() {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.filterSalesPage();
        salesPage.clicktshirtred();
        salesPage.clickonesie();
        salesPage.clickCart();
    }

}
