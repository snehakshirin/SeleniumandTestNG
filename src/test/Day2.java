package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {

	@Parameters({"URL","APIKey","Username"})
	@Test
	public void ploan(String url,String APIKey, String username) {
		System.out.println(url);
		System.out.println(APIKey);
		System.out.println(username);
		
	}
	

	@BeforeTest
	public void FIrstExecution() {
		System.out.println("I will execute first test level");
	}
	
	@AfterMethod
	public void beforeMethod() {
		//selenium
		System.out.println("I will execute last method level ");
	}

}
