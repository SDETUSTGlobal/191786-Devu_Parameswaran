from behave import *
from selenium import webdriver
import time



@when(u'the Rediffmail login page is displayed')
def login(context):
    context.driver = webdriver.Chrome(executable_path="D:/eclipse/chromedriver.exe")
    context.driver.get("https://mail.rediff.com/cgi-bin/login.cgi")
    time.sleep(2)


@when(u'the user enters the username and password')
def enter(context):
    context.driver.find_element_by_xpath('//*[@id="login1"]').send_keys('elsageorge2000')
    context.driver.find_element_by_name('passwd').send_keys('812000@Ss')


@then(u'the user click on login')
def click(context):
    context.driver.find_element_by_xpath('/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]').click()
    time.sleep(2)
    context.driver.close()