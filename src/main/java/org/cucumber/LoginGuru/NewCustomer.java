package org.cucumber.LoginGuru;



import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class NewCustomer {
	 
	

	@Given("User is in Guru Manager Home page")
	public void user_is_in_Guru_Manager_Home_page() {
		
		Assert.assertTrue(SuccessfulLogin.driver.getCurrentUrl().contains("Managerhomepage"));
	}

	@Given("The user navigates to new customer page")
	public void the_user_navigates_to_new_customer_page() {
		SuccessfulLogin.driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		Assert.assertTrue(SuccessfulLogin.driver.getCurrentUrl().contains("addcustomerpage"));
	}

	@When("The user fill the customer details")
	public void the_user_fill_the_customer_details(DataTable credentials) {
		List<Map<String,String>> credentialMap=credentials.asMaps(String.class,String.class);
		System.out.println(credentialMap);
		SuccessfulLogin.driver.findElement(By.name("name")).sendKeys(credentialMap.get(0).get("Customer Name"));
		  // if(gender.equals("Male"))
			//   SuccessfulLogin.driver.findElement(By.xpath("//input[@value='m']")).click();
		   //else
			 //  SuccessfulLogin.driver.findElement(By.xpath("//input[@value='f']")).click();
		  SuccessfulLogin.driver.findElement(By.id("dob")).sendKeys(credentialMap.get(0).get("DOB"));
		  SuccessfulLogin.driver.findElement(By.name("addr")).sendKeys(credentialMap.get(0).get("Address"));
		  SuccessfulLogin.driver.findElement(By.name("city")).sendKeys(credentialMap.get(0).get("city"));
		  SuccessfulLogin.driver.findElement(By.name("state")).sendKeys(credentialMap.get(0).get("state"));
		  SuccessfulLogin.driver.findElement(By.name("pinno")).sendKeys(credentialMap.get(0).get("pin"));
		  SuccessfulLogin.driver.findElement(By.name("telephoneno")).sendKeys(credentialMap.get(0).get("phone"));
		  SuccessfulLogin.driver.findElement(By.name("emailid")).sendKeys(credentialMap.get(0).get("email"));
		  SuccessfulLogin.driver.findElement(By.name("password")).sendKeys(credentialMap.get(0).get("password"));
		  
		  
	}
	

	@When("user clicks submit button in add customer page")
	public void user_clicks_submit_button_in_add_customer_page() {
		SuccessfulLogin.driver.findElement(By.name("sub")).click();
		
	}

	@Then("The user should see the sucessfull message")
	public void the_user_should_see_the_sucessfull_message() {
		Assert.assertEquals("Customer Registered Successfully!!!", SuccessfulLogin.driver.findElement(By.xpath("//p[@class='heading3']")).getText());
	}


}
