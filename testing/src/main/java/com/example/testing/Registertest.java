package com.example.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.example.testing.Registerpage;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Registertest {
	
	
	public static void main(String args[])
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		Registerpage.Gender(driver).click();
		
	}
}