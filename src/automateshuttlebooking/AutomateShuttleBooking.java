/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automateshuttlebooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Arpitagarwal
 */
public class AutomateShuttleBooking {

    /**
     * @param args the command line arguments
     */
    WebDriver driver;
    public AutomateShuttleBooking(WebDriver driver){
        this.driver = driver;
    }
    
    public void OpenRms(){
        driver.get("http://rms.qait.com/web/login?redirect=http%3A%2F%2Frms.qait.com%2Fweb");
    }
    
    public void EnterCredentials(String userName, String password){
        driver.findElement(By.id("login")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
    }
    
    public void Login(){
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
    }
    
    public void Create(){
        driver.findElement(By.cssSelector("oe_button.oe_list_add.oe_highlight")).click();
    }
    
    
}