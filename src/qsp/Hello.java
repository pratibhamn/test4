package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello {

	public static void main(String[] args) {
		String key = "webdriver.gecko.driver";
		String value = "./drivers/geckodriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver= new FirefoxDriver();
        driver.get("https://www.google.com");

     //driver.findElement(By.linkText("Gmail")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();

        

     //driver.findElement(By.xpath("//p[contains(text(),' ')]")).click();

        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
    
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("*********");
        
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();



	}

}
