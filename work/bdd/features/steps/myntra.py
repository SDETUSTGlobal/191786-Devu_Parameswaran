from behave import *
from selenium import webdriver
import time


@when(u'user on home page.')
def home(context):
    context.driver = webdriver.Chrome(executable_path="D:/eclipse/chromedriver.exe")
    context.driver.get("https://www.myntra.com/")
    time.sleep(2)


@when(u'user enters top on search bar')
def enters(context):
    context.driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/input").send_keys("Top")
    time.sleep(2)


@when(u'user clicks "search" button')
def clicks(context):
    context.driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/a/span").click()
    time.sleep(2)


@then(u'user enters new site')
def new(context):
    context.driver.get("https://www.myntra.com/tops/sassafras/sassafras-black-high-neck-cropped-top/12222036/buy")


@then(u'user selects size')
def selects(context):
    context.driver.find_element_by_xpath("/html/body/div[2]/div/div/div/main/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/button/p/div").click()


@then(u'user clicks add to bag')
def clicks(context):
    context.driver.find_element_by_xpath("/html/body/div[2]/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]").click()


@when(u'user has navigates to add to bag')
def navigates(context):
    context.driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/a[2]/span[3]").click()
    time.sleep(2)



@when(u'close browser')
def close(context):
    context.driver.close()
