package com.saucedemo.main.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    private LoginPage(){

    }

    public static final Target INPUT_USERNAME = Target.the("input para ingresar el usuario").
            locatedBy("//input[@id='user-name']");

    public static final Target INPUT_PASSWORD = Target.the("input para ingresar el password").
            locatedBy("//input[@id='password']");
    public static final Target BTN_LOGIN= Target.the("Boton para iniciar sesion").
            locatedBy("//input[@id='login-button']");
}
