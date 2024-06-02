package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginStep {
    LoginPage loginPage;
    public LoginStep(){
        this.loginPage = new LoginPage();
    }

    @Given("user is on login page")
    public void userIsOnLoginPage(){
        loginPage.webLogin();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith (String username){
        loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith (String password){
        loginPage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton(){
        loginPage.clickButtonLogin();
    }

    @Then("user able to see error message {string}")
    public void userWillSeeErrorMessage(String errorMessage){
        loginPage.validateErrorMessage(errorMessage);
    }
}
