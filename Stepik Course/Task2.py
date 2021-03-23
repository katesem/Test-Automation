from selenium import webdriver
import time

try:
    browser = webdriver.Chrome(r'C:\Users\kate_s\Downloads\chromedriver\chromedriver.exe')
    browser.get("http://suninjuly.github.io/find_xpath_form")

    input1 = browser.find_element_by_name("first_name")
    input1.send_keys("Kate")
    input2 = browser.find_element_by_name("last_name")
    input2.send_keys("Sem")
    input3 = browser.find_element_by_css_selector(".form-control.city")
    input3.send_keys("Kyiv")
    input4 = browser.find_element_by_id("country")
    input4.send_keys("Ukraine")
    button = browser.find_element_by_xpath(r'//button[@type = "submit"]')
    button.click()

finally:
    time.sleep(30)
    browser.quit()
