from selenium import webdriver
import time
from selenium.webdriver.support.ui import Select

try:
    browser = webdriver.Chrome(r'C:\Users\kate_s\Downloads\chromedriver\chromedriver.exe')
    browser.get("http://suninjuly.github.io/selects1.html")

   
    num1 = int(browser.find_element_by_id("num1").text)
    num2 = int(browser.find_element_by_id("num2").text)

    dr = browser.find_element_by_css_selector("select#dropdown")
    dropdown = Select(browser.find_element_by_xpath('//*[@id="dropdown"]'))
    dropdown.select_by_value(str(num1 + num2))
    
  
    button = browser.find_element_by_css_selector('[type = "submit"]')
    button.click()


finally:
    time.sleep(30)
    browser.quit()
