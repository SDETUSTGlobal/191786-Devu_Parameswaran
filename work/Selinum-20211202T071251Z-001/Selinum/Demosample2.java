package selinum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demosample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();  
		  driver.manage().window().maximize();  
	      driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");    
	      driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	      driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	      driver.findElement(By.id("ctl00_MainContent_login_button")).click();   

	    
	      driver.findElement(By.partialLinkText("Check")).click();
	      driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click(); 

	      driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click(); 
	      driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[13]/input")).click(); 
	      driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).clear();  
	      driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys("1"); 
	     
	      driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[5]/input[2]")).click(); 
	       
	 
	      driver.findElement(By.tagName("ctl00$MainContent$fmwOrder$ddlProduct")).sendKeys("Screensaver");
	      driver.findElement(By.linkText("Update")).click();
	     
	}

}