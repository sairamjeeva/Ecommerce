package common.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google {
    public void Login(String Browser){

        WebDriverManager.chromedriver().setup();

        if(Browser.equalsIgnoreCase("chrome")){
            WebDriver driver =new ChromeDriver();
            driver.get("https://www.google.com/");
        }else if(Browser.equalsIgnoreCase("Edge")){
            WebDriver driver =new EdgeDriver();
        }else{
            System.out.println("unable to launch the browser");
        }
    }


}
