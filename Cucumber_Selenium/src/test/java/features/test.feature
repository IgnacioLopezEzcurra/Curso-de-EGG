Feature: Categoria Comics
  Como usuario quiero leer chistes de testers para reirme y pasar un buen rato.

  Scenario: Ingresar a la categoria comics desde la pantalla Home.
    Given El usuario se encuentra en la pagina Home de imalittletester
    When Hace clic sobre el boton de Latest Comics
    Then Se debe redirigir a la pantalla de Comics