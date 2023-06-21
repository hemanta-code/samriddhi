package com.samriddhi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.samriddhi.elements.ProgramAllocationElements;

import commonLibs.implementation.CommonDriver;

public class ProgramAllocation extends ProgramAllocationElements {
	
	
	public ProgramAllocation(WebDriver rdriver) {
		super(rdriver);
	}
	
	
	public void gotoAddProgramAllocation() {
		elementControl.clickElement(clickProgram);
		elementControl.clickElement(clickProgramAllocation);
		elementControl.clickElement(clickAddProgramAllocation);
	}
	
	public void getFiscalYear(String fiscal) {
		elementControl.selectViaVisibleText(selectFiscalYear, fiscal);
	}
	
	public void getOffice(String office) {
		elementControl.selectViaVisibleText(selectOffice, office);
	}
	
	public void setProgramName(String programName) {
		elementControl.setText(enterProgramName, programName);
	}
	
	public void selectDeadline() throws InterruptedException {
		elementControl.clickElement(setDeadline);
		Thread.sleep(2000);
		elementControl.clickElement(todayDate);
	}
	
	public void clickSubmit() {
		elementControl.clickElement(btnSubmit);
	}
	
	
	
	
	
	
	

//	public void addProgramAllocation(String fiscal, String office) throws InterruptedException {
//		
//		elementControl.clickElement(clickProgram);
//		elementControl.clickElement(clickProgramAllocation);
//		elementControl.clickElement(clickAddProgramAllocation);
//		Thread.sleep(2000);
//		elementControl.selectViaVisibleText(selectFiscalYear, fiscal);
//		elementControl.selectViaVisibleText(selectOffice, office);
//	}
}
