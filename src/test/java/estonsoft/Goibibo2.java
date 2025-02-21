package estonsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Goibibo2 {

	public Goibibo2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/users/login/");
		//driver.manage().window().maximize();
		//WebElement name = driver.findElement(By.cssSelector("id_username"));
		WebElement name = driver.findElement(By.cssSelector("input[name='username']"));
		name.sendKeys("Poornima.kedare@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		password.sendKeys("Pareshpatel@1234");
		WebElement button = driver.findElement(By.cssSelector("input[id='signinBtn']"));
		button.click();
		


	}

}
