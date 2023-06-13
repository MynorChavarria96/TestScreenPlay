package com.saucedemo.main.stepdefinitions;

import com.saucedemo.main.hooks.SaauceDemoHooks;
import com.saucedemo.main.tasks.IngresarCredencialesInicioSesion;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraStepDefinitions {

    @Given("que estoy en la pagina de inicio de sesion de SouceDemo")
    public void queEstoyEnLaPaginaDeInicioDeSesionDeSouceDemo() {
        theActorInTheSpotlight().attemptsTo(
                Open.url(SaauceDemoHooks.getProperties().getProperty("sauceDemoURL"))
        );

    }
    @When("ingreso mis credenciales de inicio de sesion")
    public void ingresoMisCredencialesDeInicioDeSesion() {
    theActorInTheSpotlight().attemptsTo(
            IngresarCredencialesInicioSesion.conCredenciales(
                    SaauceDemoHooks.getProperties().getProperty("sauceDemoUser"),
                    SaauceDemoHooks.getProperties().getProperty("sauceDemoPassword")
                    )
    );
    }
    @And("selecciono un producto para compra")
    public void seleccionoUnProductoParaCompra() {

    }
    @And("completo el proceso de compra")
    public void completoElProcesoDeCompra() {

    }
    @Then("se muestra {string} de confirmacion de compra exitosa")
    public void seMuestraDeConfirmacionDeCompraExitosa(String string) {

    }
}
