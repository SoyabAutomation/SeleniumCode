package seleniumnucoteveningsession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Firstautomationscript {

	public static void main(String[] args) {
		 //to launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver odriver=new ChromeDriver();
        //to pass the value to the explore
        odriver.get("https://www.saucedemo.com/");
        
        odriver.findElement(By.id("user-name")).sendKeys("standard_user");
        odriver.findElement(By.id("password")).sendKeys("secret_sauce");
        odriver.findElement(By.id("login-button")).click();
        odriver.close();

	}

}
