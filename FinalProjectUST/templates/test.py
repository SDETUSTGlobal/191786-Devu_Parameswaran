from selenium import webdriver
import time

from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
print("sample test case started")
driver = webdriver.Chrome("D://eclipse//chromedriver.exe")

driver.maximize_window()
driver.delete_all_cookies()

driver.get("http://127.0.0.1:5000/")
driver.find_element_by_id("name").send_keys("Deepu")
time.sleep(2)
driver.find_element_by_name("uid1").send_keys("1917")
time.sleep(2)
driver.find_element_by_xpath("/html/body/form/div[2]/div[2]/input").send_keys("UST")
time.sleep(2)
driver.find_element_by_id("email").send_keys("1917@ust-global.com")
time.sleep(2)
driver.find_element_by_class_name("btn").click()
time.sleep(2)
driver.close()
print("successfully completed")