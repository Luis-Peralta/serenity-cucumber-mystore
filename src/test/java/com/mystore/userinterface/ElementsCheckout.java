package com.mystore.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ElementsCheckout extends PageObject implements IStepsCheckout {
    @FindBy(id = "total_price")
    protected WebElementFacade totalPrice;

    @FindBy(xpath = "//ul[@id='address_delivery']//li[contains(@class, 'address_address1')]")
    protected WebElementFacade deliveryAddress;

    @FindBy(css = "textarea")
    protected WebElementFacade textArea;

    @FindBy(xpath = "//div[@class='delivery_option_price']")
    protected WebElementFacade deliveryPrice;

    @FindBy(xpath = "//span[@class='price']//strong")
    protected WebElementFacade amountPrice;

    @FindBy(xpath = "//div[contains(@class, 'box')]//strong[2]")
    protected WebElementFacade detailsInclude;

}
