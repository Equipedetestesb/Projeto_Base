package gherkin.stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.hook.Hook;
import org.openqa.selenium.WebDriver;
import pageObject.LoginDemoPO;
import setup.DriverManager;

public class LoginDemoSteps_Hook extends DriverManager {


    private LoginDemoPO loginDemo;

    public LoginDemoSteps_Hook(){
        loginDemo = new LoginDemoPO(driver);
    }



    @Given("^que usuário está na tela de login$")
    public void que_usuário_está_na_tela_de_login() throws Throwable {
        loginDemo.telaInicio();

    }


    @When("^efetuada com (.*) e (.*)$")
    public void efetuada_o_login_com_os_dados_corretos(String nome, String senha){

        loginDemo.insereUsuario(nome);
        loginDemo.insereSenha(senha);
        loginDemo.clickLogin();


//        driver.findElement(By.id("name")).sendKeys(nome);
//        driver.findElement(By.id("password")).sendKeys(senha);
//        driver.findElement(By.id("login")).click();
    }

    @Then("^dever ser visualizada a página logada$")
    public void dever_ser_visualizada_a_página_logada() throws Throwable {

        loginDemo.checkLogoutIsDisplayed();

//        driver.findElement(By.id("logout")).isDisplayed();//verifica botão Logout habilitado


    }
}
