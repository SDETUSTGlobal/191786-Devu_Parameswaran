package viewallorders;
	import java.util.List;

import org.openqa.selenium.By;  
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;  
	import cucumber.annotation.en.Given;  
	import cucumber.annotation.en.Then;  
	import cucumber.annotation.en.When;
import cucumber.table.DataTable;

  
	public class Order {

		WebDriver driver= null;
		 @Given("User is on Home Page")  
		 public void goToWebLogin() {  
			 System.setProperty("webdriver.chrome.driver","C://Users//devu laptop//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		 
		 driver= new ChromeDriver();
		 driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");  
		 }  
		@When("^User enters Credentials to LogIn$")
			public void user_enters_testuser__and_Test(DataTable usercredentials) {
				List<List<String>> data = usercredentials.raw();
				driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester"); 
			    driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
			    driver.findElement(By.id("ctl00_MainContent_login_button")).click();
			}
		@Then("^Message displayed Login Successfully$")
		public void message_displayed_Login_Successfully() {
			System.out.println("Login Successfully");
		}
		@When("user click check all button")
		public void checkall(){
			 driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
		}
		@Then("^Message displayed Login Successfully$")
		public void message_displayed_checkall() {
			System.out.println("all the checkboxes are ticked");
		}
		 
		 
		
		}