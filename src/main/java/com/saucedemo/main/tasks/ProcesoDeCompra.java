package com.saucedemo.main.tasks;

import com.saucedemo.main.userinterfaces.CartPage;
import com.saucedemo.main.userinterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProcesoDeCompra implements Task {
    private final String firstName;
    private  final String lastName;
    private  final String zipCode;

    public ProcesoDeCompra(String firstName, String lastName, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public static Performable deFormaExitosa(String firstName, String lastName, String zipCode) {
    return instrumented(ProcesoDeCompra.class, firstName,lastName,zipCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PrincipalPage.BTN_CART),
                Click.on(CartPage.BTN_CHECKOUT),
                Enter.theValue(firstName).into((CartPage.INPUT_FIRTSNAME)),
                Enter.theValue(lastName).into((CartPage.INPUT_LASTNAME)),
                Enter.theValue(zipCode).into((CartPage.INPUT_ZIP_CODE)),
                Click.on(CartPage.BTN_CONTINUE),
                Click.on(CartPage.BTN_FINISH)

        );
    }
}
