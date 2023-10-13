package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 {

	@Test(dataProvider="getData")
	public void webLoginHomeLoan(String username, String password) {
		//selenium
		System.out.println("Web Login Home");
		System.out.println(username);
		System.out.println(password);

	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[3][2];
		//first set
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		//second set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		//third set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
	}
	@BeforeSuite
	public void beforeSuite() {
		//selenium
		System.out.println("I will execute first suite level");
	}
	@Test
	public void MobileLoginHomeLoan() {
		//appium
		System.out.println("Mobile Login Home");

	}
	
	@Test
	public void APILoginHomeLoan() {
		//API
		System.out.println("API Login Home");

	}
	
	@BeforeClass
	public void beforeClass() {
		//selenium
		System.out.println("I will execute first class level ");
	}
	
	@AfterClass
	public void afterClass() {
		//selenium
		System.out.println("I will execute last class level ");
	}
	
	@Test(groups= {"smoke"})
	public void difffer() {
		System.out.println("twogroup");
	}

}
