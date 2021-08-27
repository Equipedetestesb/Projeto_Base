package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;//PageFactory simplifica a questão da PageObject

public class HomePage_PF {

    @FindBy(id = "logout")
    WebElement btn_logout;

    WebDriver driver;
    public HomePage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);//esta parte do construtor habilita que essa classe, representada pelo
        //"this", tenha seus métodos usados em outras classes
    }

    public void checkLogoutIsDisplayed(){
        btn_logout.isDisplayed();
    }
}
