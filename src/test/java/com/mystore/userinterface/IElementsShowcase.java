package com.mystore.userinterface;

public interface IElementsShowcase {
    String LINK_NAV_BAR = "//ul[contains(@class,'sf-menu')]/li/a[contains(.,'{0}')]";
    String COLOR_PRODUCT = "//a[contains(@href, '{0}')]";
    String IMG_PRODUCT = "//img[contains(@src, '{0}')]";
}
