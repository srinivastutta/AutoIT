package com.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoIT {
	
	@Test
	public void FileUploadTest() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
						
		WebElement button =driver.findElement(By.xpath("//input[@id='imagesrc']"));
		act.moveToElement(button).click().build().perform();
		
		Runtime.getRuntime().exec("src\\main\\resources\\FileUpload.exe");
		
	}
}
