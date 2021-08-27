package gherkin.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;
import setup.DriverManager;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_PF{

//    WebDriver driver = null;
//    LoginPage_PF login;
//    HomePage_PF home;
//
//    @Given("^que usuário está na tela de login$")
//    public void que_usuário_está_na_tela_de_login() throws Throwable {
//
//        System.out.println("=== Estou na classe LoginDemoSteps_PF ===");
//
//        String caminhoProjeto = System.getProperty("user.dir");
//        System.out.println("Caminho do projeto é "+caminhoProjeto);
//
//        System.setProperty("webdriver.chrome.driver", "Projeto_Base/src/test/resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        driver.navigate().to("https://example.testproject.io/web/");
//    }
//
//    @When("^efetuada com (.*) e (.*)$")
//    public void efetuada_o_login_com_os_dados_corretos(String nome, String senha){
//
//        login = new LoginPage_PF(driver);
//
//        login.enterUsername(nome);
//        login.enterPassword(senha);
//        login.clickOnLogin();
//
////        driver.findElement(By.id("name")).sendKeys(nome);
////        driver.findElement(By.id("password")).sendKeys(senha);
////        driver.findElement(By.id("login")).click();
//    }
//
//    @Then("^dever ser visualizada a página logada$")
//    public void dever_ser_visualizada_a_página_logada() throws Throwable {
//
//          home = new HomePage_PF(driver);
//
//          home.checkLogoutIsDisplayed();
//
////        driver.findElement(By.id("logout")).isDisplayed();//verifica botão Logout habilitado
////        driver.getPageSource().contains(nome);
////        frase = driver.findElement(By.id("greetings")).getText();
//
//        Thread.sleep(2000);
//        driver.close();
//        driver.quit();
//    }
}
