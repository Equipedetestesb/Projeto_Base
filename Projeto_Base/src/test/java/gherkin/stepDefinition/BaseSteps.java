package gherkin.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseSteps {

    WebDriver driver = null;

    @Given("^usuário deseja acessar a Url do Google$")
    public void usuário_deseja_acessar_a_Url_do_Google() throws Throwable {
        String caminhoProjeto = System.getProperty("user.dir");
        System.out.println("Caminho do projeto é "+caminhoProjeto);

        System.setProperty("webdriver.chrome.driver", "Projeto_Base/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com.br/");

    }

    @When("^efetuada uma pesquisa$")
    public void efetuada_uma_pesquisa() throws Throwable {

        System.out.println("Insere a pesquisa e clica no botão de pesquisar");
        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
        driver.findElement((By.name("btnK"))).click();
    }

    @Then("^visualiza os resultados$")
    public void visualiza_os_resultados() throws Throwable {

        System.out.println("Vê se na página contém opção Online Courses");
        driver.getPageSource().contains("Online Courses");


        driver.close();
        driver.quit();

    }
}
