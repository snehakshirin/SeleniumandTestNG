package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day1 {

	@AfterTest
	public void executelasttestlevel() {
		System.out.println("I will execute last test level");
	}
	
	@Parameters({"URL"})
	@Test
	public void secondTest(String urlname) {
		System.out.println("printing the url"+urlname);
	}
	@Test
	public void demo() {
		System.out.println("Hello");
	}
	@Test(groups= {"smoke"})
	public void difffer() {
		System.out.println("onegroup");
	}
	

}
