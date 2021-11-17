package com.mystore.tasks;

import com.mystore.userinterface.ElementsCheckout;

public class CheckoutTasks extends ElementsCheckout {

    private String orderComplete;

    /***
     * This method obtain and return price in STEP-1 on checkout
     * @return
     */
    public String obtainTotalPrice() {
        return totalPrice.getText();
    }

    /***
     * This method is to click to continue with the next step
     */
    public void fromStep1ToNext() {
        findBy(STEP1_PROCEED_CHECKOUT).click();
    }

    /***
     * This method obtain and return delivery address that is in left box in STEP-3
     * @return
     */
    public String obtainDeliveryAddress() {
        return deliveryAddress.getText();
    }

    /**
     * This method receive a String how comment and write in textarea element in STEP-3
     *
     * @param comment
     */
    public void writeCommentInTextArea(String comment) {
        textArea.type(comment);
    }

    /***
     * This method is to click to continue with the next step (same element to step 3,4)
     */
    public void fromStep34ToNext() {
        findBy(STEP34_PROCEED_CHECKOUT).click();
    }

    /***
     * This method return text of delivery price in STEP-4
     * @return
     */
    public String obtainDeliveryPrice() {
        return deliveryPrice.getText();
    }

    /***
     * This method is to click in check box to accept terms of service in STEP-4
     */
    public void checkBoxTermsAndService() {
        findBy("#cgv").click();
    }

    /***
     * This method is to click in only one payment method
     * and also selected class trough of the pay method selected
     * @param payMethod
     */
    public void paymentMethod(String payMethod) {
        findBy(PAYMETHOD, payMethod).click();
        if (payMethod.contains("bankwire")) {
            orderComplete = ".cheque-indent";
        } else if (payMethod.contains("cheque")) {
            orderComplete = ".page-subheading";
        }
    }

    /***
     * This method is to click on the button "I confirm my order".
     */
    public void confirmMyOrder() {
        findBy("//button//span[contains(.,'I confirm my order')]").click();
    }

    /***
     * This method return text of the order if this is complete or not in STEP-5
     * @return
     */
    public String orderCompleteText() {
        return findBy(orderComplete).getText();
    }

    /***
     * This method obtain amount price in STEP-5
     * @return
     */
    public String obtainAmountPrice() {
        return amountPrice.getText();
    }

    /***
     * This method obtain these details of the order in STEP-5
     * @return
     */
    public String includeDetails() {
        return detailsInclude.getText();
    }

}
