package com.mystore.stepsdefinitions;

import com.mystore.steps.UserMyStore;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class UserSteps {

    @Steps(shared = true)
    UserMyStore user;

    @Given("^(.*) enter email: (.*) and password: (.*) to sign in$")
    public void userSignIn(String actor, String email, String password) {
        user.obtain_name_actor(actor);
        user.go_to_the_main_page();
        user.sign_in(email, password);
    }

    @When("^(.*) select: (.*) in navbar$")
    public void userSearchDress(String actor, String linkNavbar) {
        user.select_nav_bar(linkNavbar);
    }

    @And("^(.*) search product of (.*) blue-color with url img: (.*)$")
    public void userSelectColorDress(String actor, String colorCode, String description) {
        user.select_color_dress(colorCode, description);
    }

    @And("^(.*) in a product page verify name of de product: (.*) and color: (.*)$")
    public void userInProductPage(String actor, String nameProduct, String color) {
        user.verify_product_page(nameProduct, color);
    }

    @And("^(.*) complete step1 and validate price: (.*) in checkout$")
    public void userInStep1(String actor, String price) {
        user.validate_product_step1(price);
    }

    @And("^(.*) validate Address: (.*) and add comment: (.*) in step3$")
    public void userInStep3(String actor, String address, String comment) {
        user.validate_address_step3(address, comment);
    }

    @And("^(.*) validate shipping method, price: (.*) click en checkbox in step4$")
    public void userInStep4(String actor, String priceShipping) {
        user.validate_shipping_step4(priceShipping);
    }

    @And("^(.*) select payment method by: (.*) in step5$")
    public void userInStep5(String actor, String payMethod) {
        user.select_payment_step5(payMethod);
    }

    @Then("^(.*) validate transaction in order details with date: (.*), (.*), (.*)$")
    public void userValidateTransaction(String actor, String orderOk, String amount, String details) {
        user.validate_details_product(orderOk, amount, details);
    }


}
