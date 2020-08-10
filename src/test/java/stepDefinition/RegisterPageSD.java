package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import runnerTest.webPages.RegisterPage;

public class RegisterPageSD {

    RegisterPage registerPage = new RegisterPage();

    @Given("^I am on the Darksky login page$")
    public void iAmOnTheDarkskyLoginPage() throws InterruptedException {
       registerPage.getRegisterPage();
    }

    @When("^I enter (.+) into (email|password) field on the login page$")
    public void enterDataIntoTextField(String value, String textField){
        try{
            switch (textField){
                case"email":
                    registerPage.enterEmail(value);
                case "password":
                    registerPage.enterPassword(value);
            }
        } catch (Exception e) {
            System.out.println("Find me! Hahhahhaa!");
        }
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() throws InterruptedException {
        registerPage.clickOnLoginBtn();
    }

    @Then("^I verify error message \"([^\"]*)\"$")
    public void iVerifyErrorMessage(String exceptedMessage) {
        String errorMsgActual = registerPage.getErrorMessage();
        String errorMsgExpected = "password and username does not match";
        Assert.assertEquals(errorMsgActual, errorMsgExpected, "Message is not verified!");
    }

}


//    @When("^I enter abc@gmail\\.com into email field on the login page$")
//    public void iEnterAbcGmailComIntoEmailFieldOnTheLoginPage() { registerPage.enterEmail("email"); }
//
//    @When("^I enter password1 into password field on the login page$")
//    public void iEnterPassword1IntoPasswordFieldOnTheLoginPage() {
//        registerPage.enterPassword("password");
//    }


