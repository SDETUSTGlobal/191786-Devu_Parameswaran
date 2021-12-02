from behave import *
from selenium import webdriver
@given('Launch chrome browser')
def launchBrowser(context):
    context.driver = webdriver.Chrome(executable_path='D:/eclipse/chromedriver.exe')

@when('Open OrangeHRM home page')
def openHomePage(context):
    context.driver.get("https://opensource-demo.orangehrmlive.com/")

@then('Verify that the logo present in the home page')
def verifyLogo(context):
    status=context.driver.find_element_by_xpath("/html/body/div[1]/div/div[3]/div[1]/img").is_displayed()
    assert status is True

@then('close the Browser')
def closeBrowser(context):
    context.driver.close()