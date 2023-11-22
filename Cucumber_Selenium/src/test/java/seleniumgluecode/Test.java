package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

   // private ChromeDriver driver;

    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_imalittletester() throws Throwable {

    }

    @When("^Hace clic sobre el boton de Latest Comics$")
    public void hace_clic_sobre_el_boton_de_Latest_Comics() throws Throwable {

    }

    @Then("^Se debe redirigir a la pantalla de Comics$")
    public void se_debe_redirigir_a_la_pantalla_de_Comics() throws Throwable {

    }
}


  /*    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.imalittletester.com/");
        driver.manage().window().maximize();*/