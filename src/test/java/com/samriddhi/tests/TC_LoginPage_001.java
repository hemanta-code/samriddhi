package com.samriddhi.tests;

import java.util.List;

import org.testng.annotations.Test;

import com.samriddhi.pages.LoginPage;
import com.samriddhi.pages.ProgramAllocation;

import commonLibs.implementation.CommonDriver;
import junit.framework.Assert;

public class TC_LoginPage_001 extends CommonDriver {

	@Test(priority = 1)
	public void LoginWithValidCred() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		
		login.loginToApplication(email, password);
		System.out.println("Email and password entered");
		
		if(driver.getTitle().equals("MOICS PMIS")) {
			Assert.assertTrue(true);
			System.out.println("Login Success");
		}else {
			Assert.assertTrue(false);
			System.out.println("Login failed");
		}
	}
	
	
	public void LoginWithInvalidCred() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		
		login.loginToApplication("test", password);
		System.out.println("Email and password entered");
		
		if(driver.getTitle().equals("MOICS PMIS")) {
			Assert.assertTrue(true);
			System.out.println("Login Success");
		}else {
			Assert.assertTrue(false);
			System.out.println("Login failed");
		}
		
	}
	
	
	@Test(priority = 2)
	public void addProgramAllocationWithoutMilestoneTest() throws InterruptedException {
		System.out.println("Test : Add program allocation entering only required fields");
		ProgramAllocation pa = new ProgramAllocation(driver);
		pa.gotoAddProgramAllocation();
		Thread.sleep(3000);
		pa.getFiscalYear("2078/79");
		pa.getOffice("केन्द्रीय कारागार कारखाना");
		pa.setProgramName("केन्द्रीय कारागार कारखाना program");
		pa.selectDeadline();
		Thread.sleep(3000);
		pa.clickSubmit();
	}
	
	
}
