@SalidaParqueadero
Feature: prueba de salida vehiculos al parqueadero
  Yo como vigilante de ceiba-parqueadero
  Quiero ingresar a la pagina web del parqueadero
  Para poder darle salida a los vehiculos que se encuentran parqueados

  Scenario Outline: salida vehiculo
    Given el vigilante se encuentra en la pagina principal del parqueadero
    When el vigilante de click en el tab vehiculos parqueados
    And el vigilante de click en el salida en el primer registro
    Then entonces el vigilante podra ver un mensaje "<mensaje>" salida con exito

    Examples: 
      | mensaje                                                                                                |
      | Moto con placa 888-ccc a salido del parqueadero con Exito! \| Tiempo Horas : 1 \| Valor a pagar : 2500 |
