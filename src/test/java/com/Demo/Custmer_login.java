package com.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Custmer_login extends Bace_Test_01 {
@Test
	
	public void loginPage()
	{

				driver.findElement(By.xpath(".//button[text()='Customer Login']")).click();
				WebElement add_Cust =driver.findElement(By.xpath(".//select[@id='userSelect']"));
		Select s= new Select(add_Cust);
		s.selectByVisibleText("Harry Potter");
		
	    driver.findElement(By.xpath(".//button[text()='Login']")).click();
	   
	}
}
