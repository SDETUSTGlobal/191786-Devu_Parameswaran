package dataTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.WebElement;   
//import org.openqa.selenium.firefox.FirefoxDriver;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;  
import cucumber.annotation.en.Given;   
import cucumber.annotation.en.Then;   
import cucumber.annotation.en.When;   
import cucumber.table.DataTable;  

public class TestSteps {
    WebDriver driver=null;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page()  {
		System.setProperty("webdriver.chrome.driver","C://Users//devu laptop//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		driver= new ChromeDriver();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");   
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

   @When("^User click the link$")
   public void view_all_product(){
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/ul/li[2]/a")).click();
   }
   @Then("goes to the list of products ")
   public void show_view_all_products(){
	   driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Products.aspx");
   }

}