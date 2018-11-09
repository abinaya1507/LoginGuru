package org.cucumber.LoginGuru;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SuccessfulLogin {
	static WebDriver driver;
	@Given("User is in Guru Home page")
	public void user_is_in_Guru_Home_page() {
	   
		System.setProperty("webdriver.chrome.driver", "E:\\Abinaya\\Cucumber Framework\\LoginGuru\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/index.php");
		Assert.assertTrue(driver.getCurrentUrl().contains("demo.guru99"));
	    
	}

	@When("User logins with valid credentials")
	public void user_logins_with_valid_credentials() {
	    WebElement txtUser=driver.findElement(By.name("uid"));
	    txtUser.sendKeys("mngr161909");
	    Assert.assertEquals("mngr161909", txtUser.getAttribute("value"));
	    WebElement txtPassword=driver.findElement(By.name("password"));
	    txtPassword.sendKeys("mumYsEj");
	    Assert.assertEquals("mumYsEj", txtPassword.getAttribute("value"));
	    WebElement btnLogin=driver.findElement(By.name("btnLogin"));
	    btnLogin.click();
	}

	@Then("User must be in Manager Home page")
	public void user_must_be_in_Manager_Home_page() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("Managerhomepage"));
	}
}
