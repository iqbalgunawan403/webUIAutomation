package stepDef;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomeStep extends BaseTest{
    HomePage homePage;

    public HomeStep(){
        this.homePage = new HomePage();
    }

    @Then("user is on homepage")
    public void userIsOnHomePage(){
        homePage.validateHomePage();
    }

    @When("user click add to cart button")
    public void userClickAddToCartButton(){
        homePage.clickButtonAddCart();
    }

    @Then("user add product to cart")
    public void userAddProductToCart(){
        homePage.shopingCart();
    }

    @When("user click remove button")
    public void userClickRemoveButton(){
        homePage.clickButtonRemoveCart();
    }

    @Then("user can remove product in cart")
    public void userRemoveProductFromCart(){
        homePage.removeCart();
    }
}
