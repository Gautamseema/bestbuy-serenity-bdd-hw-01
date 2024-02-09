package com.bestbuy.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
public class MyStepdefs {

    static String name = null;
    static String type = null;
    static double price = 0.00;
    static String updatedname = null;
    static String updatedtype = null;
    static double updatedprice = 0.00;
    static String upc = null;
    static int shipping= 0;
    static String description=null;
    static String manufacturer=null;
    static String model= null;
    static String url="http://www.bestbuy.com/site/duracell-aaa-batteries-4-pack";
    static int productId;

    @Given("The application is running")
    public void theApplicationIsRunning() {

    }

    @When("I create a new user providing name {string}, type {string}, price <price>, upc {string},shippping <shipping>, description {string}, manufacturer {string}, model {string}, url{string}")
    public void iCreateANewUserProvidingNameTypePricePriceUpcShipppingShippingDescriptionManufacturerModelUrl(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
    }

    @Then("I verify that the user is created")
    public void iVerifyThatTheUserIsCreated() {
    }

    @And("I update the user with updatedname {string} updatedtype {string}, updatedprice <updatedprice>, upc {string},shippping <shipping>, description {string}, manufacturer {string}, model {string}, url{string}")
    public void iUpdateTheUserWithUpdatednameUpdatedtypeUpdatedpriceUpdatedpriceUpcShipppingShippingDescriptionManufacturerModelUrl(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
    }

    @Then("I verify that the user with updated name {string} is updated successfully")
    public void iVerifyThatTheUserWithUpdatedNameIsUpdatedSuccessfully(String arg0) {
    }

    @When("I delete the user with same id")
    public void iDeleteTheUserWithSameId() {
    }

    @Then("I verify that the user same id is deleted successfully")
    public void iVerifyThatTheUserSameIdIsDeletedSuccessfully() {
    }
}
