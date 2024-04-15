package com.hrm.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.hrm.driver.Driver;
import com.hrm.driver.DriverManager;
import com.hrm.pages.DashBoardPage;




public final class LoginPageTest extends BaseTest {
	
	
	private LoginPageTest () {
		
	}
	
   
	@Test
	public void test1() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Generative AI", Keys.ENTER);
		
	}
	
	public void test2() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Generative AI", Keys.ENTER);
		
	}
	




	}


