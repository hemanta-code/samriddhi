package com.samriddhi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.samriddhi.elements.LoginElements;

import commonLibs.implementation.CommonDriver;

public class LoginPage extends LoginElements{

	public LoginPage(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}

	public void changeLanguage() {
		elementControl.clickElement(langIcon);
	}
	
	public void loginToApplication(String username, String password) throws InterruptedException {
//		changeLanguage();
		elementControl.setText(userEmail, username);
		elementControl.setText(userPassword, password);
		Thread.sleep(2000);
		elementControl.clickElement(loginButton);
		Thread.sleep(2000);
	}
}
