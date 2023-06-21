package com.samriddhi.tests;

import org.testng.annotations.Test;

import com.samriddhi.pages.LoginPage;
import com.samriddhi.pages.ProgramAllocation;

import commonLibs.implementation.CommonDriver;

public class TC_ProgramAllocation_002 extends CommonDriver {
	
	@Test
	public void testAddProgramAllocation() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		
		Thread.sleep(3000);
		
		ProgramAllocation programAllocation= new ProgramAllocation(driver);
		
		
	}

}
