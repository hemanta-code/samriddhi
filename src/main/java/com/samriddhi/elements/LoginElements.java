package com.samriddhi.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.implementation.CommonDriver;

public class LoginElements extends CommonDriver{
		

		public LoginElements(WebDriver rdriver) {
			driver = rdriver;
			PageFactory.initElements(rdriver, this);
		}

	@CacheLookup
	@FindBy(name="email")
	public WebElement userEmail;
	
	@CacheLookup
	@FindBy(name="password")
	public WebElement userPassword;
	
	@CacheLookup
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
	public WebElement loginButton;
	
	@CacheLookup
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement langIcon;
}
