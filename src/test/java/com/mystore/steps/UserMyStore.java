package com.mystore.steps;

import com.mystore.userinterface.*;
import com.mystore.tasks.CheckoutTasks;
import com.mystore.tasks.ProductTasks;
import com.mystore.tasks.ShowcaseTasks;
import com.mystore.tasks.SignInTasks;
import net.serenitybdd.core.steps.ScenarioActor;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class UserMyStore extends ScenarioActor {

    private Actor actor;

    MainPage mainPage;
    SignInTasks signInPage;
    ShowcaseTasks showcasePage;
    ProductTasks productPage;
    CheckoutTasks checkoutPage;

    public void obtain_name_actor(String nameActor) {
        actor = Actor.named(nameActor);
    }

    @Step("#actor go to the main page")
    public void go_to_the_main_page() {
        mainPage.open();
    }

    @Step("#actor login with account: {0} and {1}")
    public void sign_in(String email, String password) {
        signInPage.goToLoginPage();
        signInPage.writeEmail(email);
        signInPage.writePassword(password);
        signInPage.clickSignIn();
        assertEquals("Login invalid", "MY ACCOUNT", signInPage.validateLogin());
    }

    @Step("#actor select in navbar: {0}")
    public void select_nav_bar(String linkNavbar) {
        showcasePage.selectNavBar(linkNavbar);
    }

    @Step("#actor select dress of color: {0} with img url: {1}")
    public void select_color_dress(String colorCode, String urlImg) {
        showcasePage.selectColorProduct(urlImg, colorCode);
    }

    @Step("#actor verify product select: {0}, add to cart and verify color: {1}")
    public void verify_product_page(String nameProduct, String color) {
        assertEquals(nameProduct, productPage.obtainNameProduct());
        productPage.productAddToCart();
        assertEquals(color, productPage.verifyColor());
        productPage.proceedToCheckout();
    }

    //After modal
    @Step("#actor validate in modal step1 price: {0} of the product")
    public void validate_product_step1(String price) {
        assertEquals(price, checkoutPage.obtainTotalPrice());
        checkoutPage.fromStep1ToNext();
    }

    @Step("#actor validate address: {0} and write a comment: {1} in model step3")
    public void validate_address_step3(String address, String comment) {
        assertEquals(address, checkoutPage.obtainDeliveryAddress());
        checkoutPage.writeCommentInTextArea(comment);
        checkoutPage.fromStep34ToNext();
    }

    @Step("#actor validate shipping method, price: {0} and check terms of service")
    public void validate_shipping_step4(String priceShipping) {
        assertEquals(priceShipping, checkoutPage.obtainDeliveryPrice());
        checkoutPage.checkBoxTermsAndService();
        checkoutPage.fromStep34ToNext();
    }

    @Step("#actor select payment method by: {0} and confirm order")
    public void select_payment_step5(String payMethod) {
        checkoutPage.paymentMethod(payMethod);
        checkoutPage.confirmMyOrder();
    }

    @Step("#actor validate all order details of your product: {0}, {1}, {2}")
    public void validate_details_product(String orderOk, String amount, String details) {
        assertThat(checkoutPage.orderCompleteText(), containsString(orderOk));
        assertEquals(amount, checkoutPage.obtainAmountPrice());
        assertEquals(details, checkoutPage.includeDetails());
    }


}
