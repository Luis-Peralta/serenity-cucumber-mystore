package com.mystore.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ElementsProduct extends PageObject {
    @FindBy(css = "h1")
    protected WebElementFacade nameProduct;

    @FindBy(xpath = "//p[@id='add_to_cart']//button")
    protected WebElementFacade buttonAddToCart;

    @FindBy(id = "layer_cart_product_attributes")
    protected WebElementFacade colorAndSize;

    @FindBy(xpath = "//a[@title= 'Proceed to checkout']")
    protected WebElementFacade goCheckout;
}
