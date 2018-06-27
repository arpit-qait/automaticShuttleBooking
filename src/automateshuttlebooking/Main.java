/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automateshuttlebooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Arpitagarwal
 */
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\My Practice\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        AutomateShuttleBooking obj = new AutomateShuttleBooking(driver);
        obj.OpenRms();
        obj.EnterCredentials("Arpitagarwal", "Arpit@321#");
        obj.Login();
        obj.Create();
        obj.FillDetails();
    }
}
