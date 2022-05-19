package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\work\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.xpath("//input[@class='email required input_authentication']")).sendKeys("gautam959880@gmail.com");
		driver.findElement(By.xpath("//input[@class='required input_authentication']")).sendKeys("rajAn@1234");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//edit the name and change the password....
//		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
//		driver.findElement(By.linkText("Profile")).click();
//		driver.findElement(By.id("edit")).click();
//		driver.findElement(By.id("user_name")).sendKeys("Gautam Gupta");
//		driver.findElement(By.xpath("//a[@id='change_password']")).click();
//		driver.findElement(By.xpath("//input[@id=\"user_password\"]")).sendKeys("rajAn@1234");
//		driver.findElement(By.id("user_password_confirmation")).sendKeys("rajAn@1234");
//		driver.findElement(By.xpath("//input[@value='Update']")).click();
	

	}

}
