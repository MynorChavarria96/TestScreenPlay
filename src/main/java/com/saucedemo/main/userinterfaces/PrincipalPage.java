package com.saucedemo.main.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class PrincipalPage {
    private PrincipalPage(){

    }
    public static final Target PRODUCT = Target.the("producto de la lista")
            .locatedBy("//div[@class='inventory_item_name' and text() = '{0}']");
    public static final Target BTN_ADD_PRODUCT = Target.the("Boton para Agregar carrito de compras")
            .locatedBy(".btn_primary.btn_inventory");
    public static final Target BTN_CART = Target.the("Boton de carrito de compras")
            .locatedBy("//a[@class='shopping_cart_link']");

}
