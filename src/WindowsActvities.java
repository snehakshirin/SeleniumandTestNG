import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActvities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		driver.navigate().back();
		driver.navigate().forward();

	}

}
