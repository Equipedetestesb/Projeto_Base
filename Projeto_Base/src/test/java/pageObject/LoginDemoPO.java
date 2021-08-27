//Classe de PageObject(PO) invocada pela classe LoginDemoSteps_com_PO

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginDemoPO {

    WebDriver driver;

    By txt_nome = By.id("name");

    By txt_senha = By.id("password");

    By btn_login = By.id("login");

    By btn_logout = By.id("logout");

    public LoginDemoPO(WebDriver driver){
        this.driver = driver;
    }

    public void telaInicio(){
        String caminhoProjeto = System.getProperty("user.dir");
        System.out.println("Caminho do projeto é "+caminhoProjeto);
        System.out.println("Tela inicial");
    }

    public void insereUsuario(String nome){
        driver.findElement(txt_nome).sendKeys(nome);
    }

    public void insereSenha(String senha){
        driver.findElement(txt_senha).sendKeys(senha);
    }

    public void clickLogin(){
        driver.findElement(btn_login).click();
    }

    public void checkLogoutIsDisplayed(){
        driver.findElement(btn_logout).isDisplayed();
    }

    public void fazerLogin(String nome, String senha){
        driver.findElement(txt_nome).sendKeys(nome);
        driver.findElement(txt_senha).sendKeys(senha);
        driver.findElement(btn_login).click();
    }
}
