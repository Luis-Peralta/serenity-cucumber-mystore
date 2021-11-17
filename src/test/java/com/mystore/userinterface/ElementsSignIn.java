package com.mystore.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ElementsSignIn extends PageObject {
    @FindBy(className = "login")
    protected WebElementFacade buttonLogin;

    @FindBy(id = "email")
    protected WebElementFacade inputEmail;

    @FindBy(id = "passwd")
    protected WebElementFacade inputPass;

    @FindBy(id = "SubmitLogin")
    protected WebElementFacade submitLogin;

    @FindBy(className = "page-heading")
    protected WebElementFacade loginOk;
}
