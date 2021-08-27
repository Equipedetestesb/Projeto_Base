package gherkin.hook;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import setup.DriverManager;

import java.util.concurrent.TimeUnit;

public class Hook extends DriverManager{


    @Before
    public void init(Scenario scenario){
        testScenario = scenario;
        System.setProperty("webdriver.chrome.driver", "Projeto_Base/src/test/resources/chromedriver.exe");


        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.navigate().to("https://example.testproject.io/web/");


//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com.br/");
        System.out.println("Entrou");
   }

    @After
    public void finish(){
        driver.close();
    }

}
