package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runnerTest.webPages.TodayPage;


public class TodayPageSD {

    public TodayPage todayPage = new TodayPage();

    @Given("^I am on Darksky home page$")
    public void iAmOnDarkskyHomePage() throws Throwable {
       todayPage = new TodayPage();
    }

    @When("^I click on today button field on home screen$")
    public void iClickOnTodayButtonFieldOnHomeScreen() {
        todayPage.clickTodayBtn();
    }

    @When("^I get lowest temperature, verify displayed temperature and enter value on home screen$")
    public void iGetLowestTemperatureVerifyDisplayedTemperatureAndEnterValueOnHomeScreen() throws InterruptedException {
        todayPage.verifyLowTemp();
    }

    @Then("^I get highest temperature, verify displayed temperature and enter value on home screen$")
    public void iGetHighestTemperatureVerifyDisplayedTemperatureAndEnterValueOnHomeScreen() throws InterruptedException {
        todayPage.verifyHighTemp();
    }




}
