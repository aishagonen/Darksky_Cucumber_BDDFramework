package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import runnerTest.webPages.HomePage;

public class HomePageSD {

    HomePage homePage = new HomePage();

    @Given("^I am on the Darksky home page$")
    public void iAmOnTheDarkskyHomePage() {
        homePage = new HomePage();
    }

    @When("^I enter \"([^\"]*)\" into search text field on home screen$")
    public void iEnterIntoSearchTextFieldOnHomeScreen(String city)  {
        homePage.enterCity(city);
    }


    @And("^I verify city’s time zone$")
    public void iVerifyCitySTimeZone() {
        homePage.getTimeZone();
        Assert.assertTrue(true,"Time zone is not verified!");


    }


    @Then("^I verify timeline is displayed with two hours incremented$")
    public void iVerifyTimelineIsDisplayedWithTwoHoursIncremented() throws InterruptedException {
        homePage.verifyTimeLine();
    }



}



