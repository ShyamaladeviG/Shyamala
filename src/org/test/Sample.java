package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Shyamala Devi\\eclipse-workspace\\Hotel\\Chrome\\chromedriver.exe");
	
	WebDriver  driver = new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
	
	WebElement textlogin = driver.findElement(By.xpath("//td[contains (text(),'Now available to')]"));
	
	String data = textlogin.getText();
	
	System.out.println("data");
	//close
	
	//quit
	}

}
