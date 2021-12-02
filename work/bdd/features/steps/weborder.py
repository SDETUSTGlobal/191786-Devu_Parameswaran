from behave import *
from selenium import webdriver
import time

@when('user on Login page.')
def Login(context):
    context.driver = webdriver.Chrome(executable_path="D:/eclipse/chromedriver.exe")
    context.driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx")

@when('user enters useranme and password')
def enters(context):
    context.driver.find_element_by_id("ctl00_MainContent_username").send_keys("Tester")
    context.driver.find_element_by_id("ctl00_MainContent_password").send_keys("test")


@when('user clicks "login" button')
def clicks(context):
    context.driver.find_element_by_id("ctl00_MainContent_login_button").click()


@then('user clicks Check all button user should see all orders checked')
def Check(context):
    context.driver.find_element_by_id("ctl00_MainContent_btnCheckAll").click()

@then('user clicks Uncheck all button user should see all orders unchecked.')
def Uncheck(context):
    context.driver.find_element_by_id("ctl00_MainContent_btnUncheckAll").click()


@then('user clicks desired orders check box user should see desired orders checked/unchecked.')
def desired(context):
    context.driver.find_element_by_id("ctl00_MainContent_orderGrid_ctl02_OrderSelector").click()
    context.driver.find_element_by_id("ctl00_MainContent_orderGrid_ctl06_OrderSelector").click()


@then('user clicks Delete selected button user should see all selected orders unchecked.')
def Delete (context):
    context.driver.find_element_by_id("ctl00_MainContent_btnDelete").click();


@then('user clicks View all products from the main page user should see List of Products.')
def products(context):
    context.driver.find_element_by_link_text("View all products").click();


@when('user has navigated to orders page')
def orders(context):
    context.driver.find_element_by_partial_link_text("Order").click();


@when('the user enters details')
def details(context):
    context.driver.find_element_by_css_selector("#ctl00_MainContent_fmwOrder_txtQuantity").send_keys("1500");
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_txtUnitPrice").send_keys("45");
    context.driver.find_element_by_xpath(
        "/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[5]/input[2]").click();
    context.driver.find_element_by_name("ctl00$MainContent$fmwOrder$txtName").send_keys("Devu")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox2").send_keys("aaaaaa")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox3").send_keys("ktm")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox4").send_keys("Kerala")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox5").send_keys("699999")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox6").send_keys("123456789")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox1").send_keys("9/26")



@when('the process button is clicked the payment is processed')
def process(context):
    context.driver.find_element_by_xpath(
        "/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[5]/input[2]").click()


@when('the reset button is clicked all the data from the columns are erased')
def reset(context):
    context.driver.find_element_by_css_selector("#ctl00_MainContent_fmwOrder_txtQuantity").send_keys("1000")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_txtUnitPrice").send_keys("80")
    context.driver.find_element_by_xpath(
        "/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[5]/input[2]").click()
    context.driver.find_element_by_name("ctl00$MainContent$fmwOrder$txtName").send_keys("Sandra")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox2").send_keys("Chennithala")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox3").send_keys("Mavelikara")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox4").send_keys("Kerala")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox5").send_keys("690104")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox6").send_keys("123456789098")
    context.driver.find_element_by_id("ctl00_MainContent_fmwOrder_TextBox1").send_keys("19/26")
    context.driver.find_element_by_xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/a").click();
    context.driver.find_element_by_xpath("/html/body/form/table/tbody/tr/td[2]/div[1]/span/a").click();


@when('close the browser')
def close(context):
    time.sleep(3)
    context.driver.close()
