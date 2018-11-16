Feature: prueba de visualizacion del trm
  Yo como vigilante de ceiba-parqueadero
  Quiero ingresar a la pagina web del parqueadero
  Para poder ver el trm del dia de hoy

  Scenario Outline: visualizacion del trm
    Given el vigilante se ubica la pagina principal del parqueadero
    Then entonces el vigilante podra ver trm del dia actual en la parte superior de la pagina

    Examples: 
      | mensaje |
      |         |
