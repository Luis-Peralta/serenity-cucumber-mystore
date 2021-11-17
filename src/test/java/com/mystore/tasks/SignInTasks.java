package com.mystore.tasks;

import com.mystore.userinterface.ElementsSignIn;

public class SignInTasks extends ElementsSignIn {

    /***
     * This method is to click on button for redirect to login page
     */
    public void goToLoginPage() {
        buttonLogin.click();
    }

    /***
     * Method to write email on input
     * @param email
     */
    public void writeEmail(String email) {
        inputEmail.type(email);
    }

    /***
     * Method to write password on input
     * @param password
     */
    public void writePassword(String password) {
        inputPass.type(password);
    }

    /***
     * Method is to click on button sign in
     */
    public void clickSignIn() {
            evaluateJavascript("arguments[0].scrollIntoView()",submitLogin);
            submitLogin.click();
    }

    /***
     * Method return text to validate if is valid your password or/and email
     * @return
     */
    public String validateLogin() {
        return loginOk.getText();
    }

}
