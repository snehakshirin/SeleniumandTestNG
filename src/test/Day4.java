package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4 {

	@Test(enabled=false)
	public void webLogincarLoan() {
		//selenium
		System.out.println("Web Login Car");
	}
	@Test
	public void MobileLoginCarLoan() {
		//appium
		System.out.println("Mobile Login Car");

	}
	
	@Test
	public void MobileSignininCarLoan() {
		//appium
		System.out.println("Mobile Signin Car");

	}
	@AfterSuite
	public void aftreSuite() {
		//selenium
		System.out.println("I will execute last suite level");
	}
	
	@Test(timeOut=4000)
	public void APILoginCarLoan() {
		//API
		System.out.println("API Login Car");
		Assert.assertTrue(false);

	}
	
	@BeforeMethod
	public void beforeMethod() {
		//selenium
		System.out.println("I will execute first method level ");
	}
	
	@Test(dependsOnMethods= {"APILoginCarLoan"})
	public void dependencyWith() {
		System.out.println("I have dependency with API login car loan");
	}
	

}
