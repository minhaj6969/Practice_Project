package com.tt.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHomePage {
	
	WebDriver driver;
	public MyHomePage (WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement tbox_userName;
	
	public WebElement gettbox_userName(){
		
		return tbox_userName;
	}
	

}
