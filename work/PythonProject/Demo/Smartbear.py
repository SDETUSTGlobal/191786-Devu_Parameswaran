from selenium import webdriver
import time
from selenium.webdriver.support.ui import Select
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
print("sample test case started")
driver = webdriver.Chrome("D://eclipse//chromedriver.exe")
driver.maximize_window()
#delete the cookies
driver.delete_all_cookies()
#navigate to the url
driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx")
driver.find_element_by_id("ctl00_MainContent_username").send_keys("Tester")
driver.find_element_by_id("ctl00_MainContent_password").send_keys("test")
driver.find_element_by_id("ctl00_MainContent_login_button").click();
time.sleep(1)
driver.find_element_by_xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/p/a[1]").click();
time.sleep(1)
driver.find_element_by_xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/p/a[2]").click();
time.sleep(1)
driver.find_element_by_xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[1]/input").click();
time.sleep(1)
driver.find_element_by_xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[13]/input").click();
time.sleep(1)
driver.find_element_by_xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[2]/input").clear();
time.sleep(1)
driver.find_element_by_xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[2]/input").send_keys("5"); 
time.sleep(1)
driver.find_element_by_xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/a").click();
time.sleep(1)
driver.find_element_by_css_selector("#ctl00_menu > li:nth-child(2) > a").click()
time.sleep(1) 
driver.find_element_by_class_name("selected").click() 
time.sleep(1) 
driver.find_element_by_partial_link_text("Or").click()
time.sleep(1)  
select = Select(driver.find_element_by_tag_name("select"))
time.sleep(1) 
select.select_by_visible_text('FamilyAlbum')
time.sleep(1) 
driver.find_element_by_name("ctl00$MainContent$fmwOrder$txtQuantity").clear()
time.sleep(1) 
driver.find_element_by_name("ctl00$MainContent$fmwOrder$txtQuantity").send_keys("3")
time.sleep(1) 
driver.find_element_by_id("ctl00_MainContent_fmwOrder_txtUnitPrice").send_keys("80")
time.sleep(1) 
driver.find_element_by_xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[5]/input[2]").click()
time.sleep(1) 
driver.find_element_by_name("ctl00$MainContent$fmwOrder$txtName").send_keys("Devu")
time.sleep(1) 
driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox2").send_keys("ettumnr")
time.sleep(1) 
driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox3").send_keys("KTM")
time.sleep(1) 
driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox4").send_keys("Kerala")
time.sleep(1) 
driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox5").send_keys("686888")
time.sleep(1) 
driver.find_element_by_id("ctl00_MainContent_fmwOrder_cardList_0").click()
time.sleep(1) 
driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox6").send_keys("5555")
time.sleep(1) 
driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox1").send_keys("2/23")
time.sleep(1) 
driver.find_element_by_xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/a").click()
time.sleep(1) 
driver.find_element_by_link_text("View all orders").click()
driver.close()  
print("successfully completed")