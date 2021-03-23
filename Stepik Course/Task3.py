from selenium import webdriver
import time
import math

def calc(x):
      return str(math.log(abs(12*math.sin(int(x)))))

try:
    browser = webdriver.Chrome(r'C:\Users\kate_s\Downloads\chromedriver\chromedriver.exe')
    browser.get("http://suninjuly.github.io/math.html")

    x = browser.find_element_by_id("input_value").text
    answer = calc(x)
    
    insert_answer = browser.find_element_by_id("answer").send_keys(answer)

    c_box = browser.find_element_by_css_selector("[for = 'robotCheckbox']")
    c_box.click()
    
    robots_radio = browser.find_element_by_css_selector("[for = 'robotsRule']")
    robots_radio.click()

    button = browser.find_element_by_css_selector('[type = "submit"]')
    button.click()

finally:
    time.sleep(30)
    browser.quit()
