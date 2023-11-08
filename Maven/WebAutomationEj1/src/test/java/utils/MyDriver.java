/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {

    private WebDriver driver;

    public MyDriver(String browser) {
        if ("firefox".equals(browser)) {
            driver = new FirefoxDriver();        
        } else{
            String path = System.getProperty("user.dir");
            System.out.println(path);
            System.setProperty("webdriver.chrome.driver",path+"\\drivers//chromedriver.exe");
            driver = new ChromeDriver();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
    
    

}
