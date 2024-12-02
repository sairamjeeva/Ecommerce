package com.example.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.http.WebSocket;
import java.net.http.WebSocketHandshakeException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Action {

public WebDriver driver;
@Test
    public void run() throws AWTException, FileNotFoundException, InterruptedException {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");
                ChromeDriver driver = new ChromeDriver(chromeOptions);
                driver.get("https://demo.automationtesting.in/FileUpload.html");
                driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4),);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,100)");
//        WebDriverWait wait=new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='input-4']")));
        WebElement element=driver.findElement(By.xpath("//div[@tabindex='500']"));
       // js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
//        WebElement ele=driver.findElement(By.xpath("//button[@id='fileSubmit']"));
//        ele.click();

        String file="C:\\Users\\SE Computers\\Documents\\javaprogram.txt";
        Robot robot=new Robot();
        StringSelection select=new StringSelection(file);

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);




    }

}
