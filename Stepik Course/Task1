from selenium import webdriver
import time

try:
    browser = webdriver.Chrome(r'C:\Users\kate_s\Downloads\chromedriver\chromedriver.exe')
    browser.get("http://suninjuly.github.io/huge_form.html")
    
    elements = browser.find_elements_by_tag_name("input")
    for element in elements:
       element.send_keys("Answer")

    button = browser.find_element_by_css_selector("button.btn")
    button.click()

finally:
    time.sleep(30)
    browser.quit()
