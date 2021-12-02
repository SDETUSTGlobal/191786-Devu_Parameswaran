package selinum;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Q1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();  
		  driver.manage().window().maximize();  
	      driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");    
	      driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	      driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	      driver.findElement(By.className("button")).click(); 
	 	 String row1= driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]")).getText(); 
	     System.out.println("Family Album in canada:" +row1); 
		List  rows = driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr")); 
		System.out.println("No of rows are : " + rows.size());
		int c=0;
		  for(int i=3;i<rows.size();i++)
		  {   
			  String text=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr["+(i)+"]/td[3]")).getText();
			  String text2=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr["+(i)+"]/td[10]")).getText();
			if(text.equals("MyMoney") && text2.equals("MasterCard"))
			{
				 				
				 
				
				 
					 c=c+1;
				 
				
			}
			
		  }
		  System.out.println("Count : " + c);
			driver.close();
			
	      

	}

}
