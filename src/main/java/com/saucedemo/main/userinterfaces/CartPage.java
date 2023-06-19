package com.saucedemo.main.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    private CartPage() {

    }

    public static final Target BTN_CHECKOUT = Target.the("Boton de Checkout")
            .locatedBy("//button[@id='checkout']");
    public static final Target INPUT_FIRTSNAME = Target.the("Input para ingresar el nombre")
            .locatedBy("//input[@id='first-name']");
    public static final Target INPUT_LASTNAME = Target.the("Input para ingresar el apellido")
            .locatedBy("//input[@id='last-name']");
    public static final Target INPUT_ZIP_CODE = Target.the("input para ingresar el zip code")
            .locatedBy("//input[@id='postal-code']");
    public static final Target BTN_CONTINUE = Target.the("boton continuar el checkout")
            .locatedBy("//input[@id='continue']");
    public static final Target BTN_FINISH = Target.the("boton para finalizar el checkout")
            .locatedBy("//button[@id='finish']");
    public static final Target TITLE_CONFIRMATION = Target.the("titulo que muestra el resultado de la compra")
            .locatedBy("//h2[@class='complete-header']");
}
