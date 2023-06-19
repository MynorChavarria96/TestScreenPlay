package com.saucedemo.main.stepdefinitions;

import com.saucedemo.main.hooks.SaauceDemoHooks;
import com.saucedemo.main.models.UsuarioDatos;
import com.saucedemo.main.questions.RespuestaConfirmacionCompra;
import com.saucedemo.main.tasks.IngresarCredencialesInicioSesion;
import com.saucedemo.main.tasks.ProcesoDeCompra;
import com.saucedemo.main.tasks.SeleccionarProducto;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
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
    @And("selecciono un producto para comprar")
    public void seleccionoUnProductoParaComprar() {
        theActorInTheSpotlight().wasAbleTo(
                SeleccionarProducto.conNombre("Sauce Labs Backpack")
        );
    }
    @And("completo el proceso de compra")
    public void completoElProcesoDeCompra() {
        theActorInTheSpotlight().attemptsTo(
                ProcesoDeCompra.deFormaExitosa(
                        UsuarioDatos.FIRST_NAME,
                        UsuarioDatos.LAST_NAME,
                        UsuarioDatos.ZIP_CODE
                )
        );
    }
    @Then("se muestra {string} de confirmacion de compra exitosa")
    public void seMuestraDeConfirmacionDeCompraExitosa(String value) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("Contiene", RespuestaConfirmacionCompra.delMensaje(value))
        );
    }
}
