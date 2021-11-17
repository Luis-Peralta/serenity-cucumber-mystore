package com.mystore.tasks;

import com.mystore.userinterface.ColorCodes;
import com.mystore.userinterface.IElementsShowcase;
import net.serenitybdd.core.pages.PageObject;

public class ShowcaseTasks extends PageObject implements IElementsShowcase {

    /***
     * This method receive per parameters for select in navBar one option
     * @param linkNavBar
     */
    public void selectNavBar(String linkNavBar) {
        findBy(LINK_NAV_BAR, linkNavBar).click();
    }

    /***
     * Method to select a color of the product, but before search description of the product
     * @param urlImg
     * @param colorCode
     */
    public void selectColorProduct(String urlImg, String colorCode) {
        ColorCodes colorSelect = Enum.valueOf(ColorCodes.class, colorCode.toUpperCase());

        withAction().moveToElement(findBy(IMG_PRODUCT, urlImg))
                .moveToElement(findBy(COLOR_PRODUCT, colorSelect.getColorCode()))
                .click().build().perform();
    }

}
