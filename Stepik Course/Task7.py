from selenium import webdriver
import time
import math
  
def calc(x):
      return str(math.log(abs(12*math.sin(int(x)))))
  
try:
    browser = webdriver.Chrome(r'C:\Users\kate_s\Downloads\chromedriver\chromedriver.exe')
    browser.get("http://suninjuly.github.io/alert_accept.html")
    
    button = browser.find_element_by_xpath(r'//button[@type = "submit"]')
    button.click()
    confirm = browser.switch_to.alert
    confirm.accept()
    
    #redirect to the next page:
    x = browser.find_element_by_xpath(r'//span[@id = "input_value"]').text
    res = calc(x)
    print(res)
    answer_field = browser.find_element_by_xpath(r'//input[@id = "answer"]')
    answer_field.send_keys(calc(x))
    
    button = browser.find_element_by_xpath(r'//button[@type = "submit"]')
    button.click()

finally:
    time.sleep(30)
    browser.quit()
