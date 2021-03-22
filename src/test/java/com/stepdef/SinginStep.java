package com.stepdef;

import org.openqa.selenium.By;

import com.common.Base;
import com.tt.page.MyHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SinginStep extends Base{
	
	MyHomePage mhp;
	
	
	@Given("^User able to go home page$")
	public void user_able_to_go_home_page() throws Throwable {
		driver = getdriver();
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')])")).click();
		
	    
	}

	@When("^enter email$")
	public void enter_email() throws Throwable {
		
		//driver.findElement(By.xpath("//input[@id='ap_email'])")).click();
			
	    mhp = new MyHomePage(driver);
	    mhp.gettbox_userName().sendKeys("");
	    
	    
	}

	@When("^enter password$")
	public void enter_password() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("12345");
	    
	    
	}

	@When("^Click sing in$")
	public void click_sing_in() throws Throwable {
		driver.findElement(By.xpath("")).submit();
	    
	}

	@Then("^Log in should be successfull$")
	public void log_in_should_be_successfull() throws Throwable {
		
	    
	    
	}


}
