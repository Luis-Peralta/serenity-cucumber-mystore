package com.mystore.userinterface;

public enum ColorCodes {
    BEIGE("/color-beige"),
    BLACK("/color-black"),
    BLUE("/color-blue"),
    GREEN("/color-green"),
    ORANGE("/color-orange"),
    PINK("/color-pink"),
    RED("/color-red"),
    YELLOW("/color-yellow"),
    WHITE("/color-white");

    ColorCodes(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    private String colorCode;
}
