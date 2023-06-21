package com.samriddhi.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.implementation.CommonDriver;

public class ProgramAllocationElements extends CommonDriver {
	
	public ProgramAllocationElements(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@CacheLookup
	@FindBy(xpath ="//*[@id=\"root\"]/div[2]/div[1]/ul/div[1]" )
	public WebElement clickProgram;
	
	@CacheLookup
	@FindBy(xpath = "//p[contains(text(),'कार्यक्रम विनियोजन')]")
	public WebElement clickProgramAllocation;
	
	@CacheLookup
	@FindBy(xpath="//button[contains(text(),'कार्यक्रम विनियोजन')]")
	public WebElement clickAddProgramAllocation;
	
	@CacheLookup
	@FindBy(xpath="//*[@id='fiscalYearId']")
	public WebElement selectFiscalYear;
	
	@CacheLookup
	@FindBy(name="officeId")
	public WebElement selectOffice;
	
	
	@CacheLookup
	@FindBy(name="programName")
	public WebElement enterProgramName;
	
	@CacheLookup
	@FindBy(name="deadLine")
	public WebElement setDeadline;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div[2]/div/div/div/table/tbody/tr[4]/td[6]")
	public WebElement todayDate;
	
	@CacheLookup
	@FindBy(xpath = "//button[contains(text(),'पेश गर्नुहोस्')]")
	public WebElement btnSubmit;

}
