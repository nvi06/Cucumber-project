package Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	WebDriver driver = new ChromeDriver();
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver.get("http://182.76.176.205/hrm/login.php");
	}
	@When("user enter invalid username and valid password")
	public void user_enter_invalid_username_and_valid_password() {
		driver.findElement(By.cssSelector("input[name=txtUserName]")).sendKeys("admin1");
		driver.findElement(By.cssSelector("input[name=txtPassword")).sendKeys("admin");
	   
	}
	@Then("user click login button")
	public void user_click_login_button() {
		driver.findElement(By.cssSelector("input[name=Submit")).click();
	}
	@Then("user get message")
	public void user_get_message() {
		boolean User_inputtxt = driver.findElement(By.cssSelector("input[name=txtUserName]")).isDisplayed();
		Assert.assertEquals(true, User_inputtxt);
	    
	}
	
	
	@Given("User is on login Page")
	public void user_is_on_Login_page() {
		driver.get("http://182.76.176.205/hrm/login.php");
	}

	@When("user enter valid username and Invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		driver.findElement(By.cssSelector("input[name=txtUserName]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name=txtPassword")).sendKeys("admin_123");
	}

	@Then("user clicked on Login button")
	public void user_clicked_on_Login_button() {
		driver.findElement(By.cssSelector("input[name=Submit")).click();
	}

	@Then("User get message")
	public void User_get_message() {
		boolean User_inputtxt = driver.findElement(By.cssSelector("input[name=txtUserName]")).isDisplayed();
		Assert.assertEquals(true, User_inputtxt);
	}

	@Given("User is on Login page")
	public void user_is_on_login_Page() {
		driver.get("http://182.76.176.205/hrm/login.php");
	}

	@When("user enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {
		driver.findElement(By.cssSelector("input[name=txtUserName]")).sendKeys("admin1");
		driver.findElement(By.cssSelector("input[name=txtPassword")).sendKeys("admin_123");
	}

	@Then("user clicked on login button")
	public void User_clicked_on_login_button() {
		driver.findElement(By.cssSelector("input[name=Submit")).click();
	}

	@Then("user get Message")
	public void user_get_Message() {
		boolean User_inputtxt = driver.findElement(By.cssSelector("input[name=txtUserName]")).isDisplayed();
		Assert.assertEquals(true, User_inputtxt);
	}
	
	@Given("User is on Login Page")
	public void User_is_on_login_page() {
		driver.get("http://182.76.176.205/hrm/login.php");
	}
	@When("user forget to enter username and password")
	public void user_forget_to_enter_username_and_password() {
		driver.findElement(By.cssSelector("input[name=txtUserName]"));
		driver.findElement(By.cssSelector("input[name=txtPassword"));
	    
	}
	@Then("User clicked on Login Button")
	public void user_clicked_on_login_button() {
		driver.findElement(By.cssSelector("input[name=Submit")).click();
	    
	}
	@Then("User get popup")
	public void user_get_popup() {
	   driver.switchTo().alert().accept();
	   boolean User_inputtxt = driver.findElement(By.cssSelector("input[name=txtUserName]")).isDisplayed();
		Assert.assertEquals(true, User_inputtxt);
	}




	
	
	
	@Given(": User is already on login page")
	public void user_is_already_on_login_page() {
	    driver.get("http://182.76.176.205/hrm/login.php");
	}

	@When(": User enter username and password")
	public void user_enter_username_and_password() {
		driver.findElement(By.cssSelector("input[name=txtUserName]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name=txtPassword")).sendKeys("admin");
	}

	@Then(": User click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.cssSelector("input[name=Submit")).click();
	}

	@Then(": User is on home page")
	public void user_is_on_home_page() {
		boolean admin_E = driver.findElement(By.cssSelector("li[id=admin]")).isDisplayed();
		Assert.assertEquals(true, admin_E);
			
	}
	
	

	
//	@Given("User is already on Login page")
//	public void user_is_already_on_login_page() {
//		driver.get("http://182.76.176.205/hrm/login.php");
//	    
//	}
//	@When("Loaded {string} uname")
//	public void loaded_uname(String unmae) {
//		driver.findElement(By.cssSelector("input[name=txtUserName]")).sendKeys(unmae);
//		 
//	}
//	@Then("Loaded {string} pword")
//	public void loaded_pword(String pass) {
//		driver.findElement(By.cssSelector("input[name=txtPassword")).sendKeys(pass);
//	    
//	}
//	@Then("User click on Login button")
//	public void user_click_on_login_button() {
//		driver.findElement(By.cssSelector("input[name=Submit")).click();
//	    
//	}

}
