from selenium import webdriver
import time

from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
print("sample test case started")
driver = webdriver.Chrome("D://eclipse//chromedriver.exe")
#driver=webdriver.firefox()
#driver=webdriver.ie()
#maximize the window size
driver.maximize_window()
#delete the cookies
driver.delete_all_cookies()
driver.get("https://www.myntra.com/")  
 
driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/input").send_keys("shoes")

time.sleep(2) 

driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/a/span").click()
time.sleep(2)
driver.get("https://www.myntra.com/casual-shoes/us-polo-assn/us-polo-assn-men-white--grey-colourblocked-sneakers/10331501/buy")
time.sleep(2)
driver.find_element_by_xpath("/html/body/div[2]/div/div/div/main/div[2]/div[2]/div[3]/div[2]/div[2]/div[1]/button/p").click()
driver.find_element_by_xpath("/html/body/div[2]/div/div/div/main/div[2]/div[2]/div[4]/div/div[1]").click()
time.sleep(1)
driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/a[2]/span[1]").click()
print("Program successfull")
#driver.close()