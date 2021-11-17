package com.mystore.tasks;

import com.mystore.userinterface.ElementsProduct;

public class ProductTasks extends ElementsProduct {

    /***
     * This method return text name of the product
     * @return
     */
    public String obtainNameProduct() {
        return nameProduct.getText();
    }

    /***
     * This method is to click on button add to cart
     */
    public void productAddToCart() {
        buttonAddToCart.click();
    }

    /***
     * This method obtain only color, but delete size of the product
     * @return
     */
    public String verifyColor() {
        return colorAndSize.waitUntilVisible().getText().split(",")[0];
    }

    /***
     * Method to is click on the button checkout
     */
    public void proceedToCheckout() {
        goCheckout.click();
    }

}
