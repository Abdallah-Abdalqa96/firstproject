import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myclass2 {
WebDriver  driver = new ChromeDriver()   ;

	
	
	String theWebsite  = "https://www.saucedemo.com/" ; 
	String UserName = "standard_user" ; 
	String Password = "secret_sauce" ; 
	//String FirstName = "Abdallah" ; 
	//String LastName = "Abdalqader" ;
	//String Postal = "11112" ; 
	
	
	
	@BeforeTest 
	public void setup () {
		//driver.get("https://www.saucedemo.com/"); 
		driver.manage().window().maximize() ;
		
		 driver.get(theWebsite); 
		 
	
		
	}
	
	
	
	@Test(priority=1) 
	public void login ()  {
          WebElement TheUserName =	driver.findElement(By.id("user-name"));
            TheUserName.sendKeys(UserName) ; 
			
          WebElement ThePassWord =	driver.findElement(By.id("password"));
            ThePassWord.sendKeys(Password) ;
			
	
		 //WebElement Login-button = driver.findElement(By.id("login-button")).click();
	      WebElement login_button = driver.findElement(By.id("login-button")) ; 
		     login_button.click(); 
		 
		//driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("lolo el7elowh "+Keys.ENTER) ; 
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
       
		
		
	}
	
	@Test(priority = 2)
	public void Addtocard()  {
            List<WebElement> Addtocard = driver.findElements(By.className("btn")); 
		
		for(int i = 1 ;i<Addtocard.size();i=i+1) {
			Addtocard.get(i).click();
			
		}
		
		
	}

		@Test (priority = 3)
		public void ShoppingCart()  {
			
			
		}
		
		
		
		
	
	
	@AfterTest 
	public void afterMyTest () {}

}
