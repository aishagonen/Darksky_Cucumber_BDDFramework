package runnerTest.webPages;

import org.openqa.selenium.By;
import utils.ElementUtil;

public class RegisterPage {

    ElementUtil elementUtil = new ElementUtil();

    By registerPage = By.partialLinkText("Dark Sky API");
    By loginPageBtn = By.className("button");
    By emailField = By.id("email");
    By passwordField = By.id("password");
    By loginBtn = By.tagName("button");
    By errorMessage = By.className("error");


    public void getRegisterPage() throws InterruptedException{
        elementUtil.clickOn(registerPage);
        Thread.sleep(2000);
        elementUtil.clickOn(loginPageBtn);
    }

    public void enterEmail(String email){
        elementUtil.sendValue(emailField, email);
    }

    public void enterPassword(String password){
        elementUtil.sendValue(passwordField, password);
    }

    public void clickOnLoginBtn() throws InterruptedException{
            elementUtil.clickOn(loginBtn);
    }

    public String getErrorMessage(){
        return elementUtil.getTextFromElement(errorMessage);
    }


}


