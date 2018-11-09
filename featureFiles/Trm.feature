Feature: prueba de visualizacion del trm
  Yo como vigilante de ceiba-parqueadero
  Quiero ingresar a la pagina web del parqueadero
  Para poder ver el trm del dia de hoy

  Scenario Outline: visualizacion del trm
    Given el vigilante se encuentra la aprincipal del parqueadero
    When el vigilante de click en el tab TRM
    Then entonces el vigilante podra ver trm del dia actual

    Examples: 
      | placa   | cilindraje | mensaje                                 |
      | 888-ccc |       3000 | Moto con placa 888-ccc Parqueado Exito! |