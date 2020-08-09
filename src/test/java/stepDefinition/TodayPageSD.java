package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runnerTest.webPages.TodayPage;

public class TodayPageSD {

    public TodayPage todayPage = new TodayPage();

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
        todayPage = new TodayPage();
    }

    @When("^I click on today button on the home page$")
    public void iClickOnOnTheHomePage() {
        todayPage.clickToday();
    }

    @Then("^I verify lowest and highest temperature for today$")
    public void iVerifyLowestAndHighestTemperatureForToday() {
        todayPage.verifyLowHighTemp();
    }

}
