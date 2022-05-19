package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\work\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		driver.findElement(By.id("spree_user_email")).sendKeys("gautam959880@gmail.com");
		///driver.findElement(By.id("spree_user_password")).sendKeys("gauTam$123");
		driver.findElement(By.xpath("//input[@class='textfield required input_authentication']")).sendKeys("gauTam@1234");
		driver.findElement(By.xpath("//input[@value='Sign Up']")).click();
	}

}
