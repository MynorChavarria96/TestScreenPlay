Feature: Prueba de compra en Saucedemo
  Scenario: Realizar una compra
    Given que estoy en la pagina de inicio de sesion de SouceDemo
    When ingreso mis credenciales de inicio de sesion
    And selecciono un producto para compra
    And completo el proceso de compra
    Then se muestra "Thank you for your order!" de confirmacion de compra exitosa
