Feature: prueba de ingreso vehiculos al parqueadero
  Yo como vigilante de ceiba-parqueadero
  Quiero ingresar a la pagina web del parqueadero
  Para poder ingresar vehiculos al parqueadero

  Scenario Outline: Title of your scenario outline
    Given el vigilante esta en la pagina principal del parqueadero
    When el vigilante de click en el tab ingresar vehiculo
    And este en el tab moto
    And e ingrese la placa "<placa>"
    And e ingrese el cilindraje "<cilindraje>"
    And el vigilante de click en el boton ingresar
    Then entonces el vigilante podra ver un mensaje "<mensaje>" parqueado con exito

    Examples: 
      | placa   | cilindraje | mensaje                                 |
      | 888-ccc |       3000 | Moto con placa 888-ccc Parqueado Exito! |
