package selinum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();  
		  driver.manage().window().maximize();  
	      driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");    
	      driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	      driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	      driver.findElement(By.className("button")).click(); 
	      driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click(); 
	      driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[13]/input")).click(); 
	      Select product=new Select(driver.findElement(By.name("ctl00$MainContent$fmwOrder$ddlProduct")));
	 
	      
          product.selectByIndex(1);
     
          product.deselectByValue("selected");
	    
	}

}