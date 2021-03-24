from selenium import webdriver
import time
import math

def calc(x):
      return str(math.log(abs(12*math.sin(int(x)))))
  
try:
    browser = webdriver.Chrome(r'C:\Users\kate_s\Downloads\chromedriver\chromedriver.exe')
    browser.get("http://suninjuly.github.io/execute_script.html")
   
    x = int(browser.find_element_by_id("input_value").text)

    answer_field = browser.find_element_by_id("answer")
    browser.execute_script("return arguments[0].scrollIntoView(true);", answer_field)
    answer_field.send_keys(calc(x))
 
    ch_box = browser.find_element_by_css_selector("[for = 'robotCheckbox']")
    ch_box.click()
    
    radio_b = browser.find_element_by_css_selector("[for = 'robotsRule']")
    radio_b.click()
    
    button = browser.find_element_by_css_selector('[type = "submit"]')
    button.click()


finally:
    time.sleep(30)
    browser.quit()
