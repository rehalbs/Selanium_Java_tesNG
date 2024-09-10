import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chrome browser
		WebDriver Cdriver = new ChromeDriver();
		//driver.get(google.com);
		Cdriver.get("https://rahulshettyacademy.com");
		System.out.println(Cdriver.getTitle());
		System.out.println(Cdriver.getCurrentUrl());
		Cdriver.quit();
		//Barry Test to push
		WebDriver FDriver = new FirefoxDriver();
		FDriver.get("https://rahulshettyacademy.com");
		System.out.println(FDriver.getTitle());
		System.out.println(FDriver.getCurrentUrl());
		FDriver.close();
	}
}
