from selenium import webdriver
import time
import os
  
try:
    browser = webdriver.Chrome(r'C:\Users\kate_s\Downloads\chromedriver\chromedriver.exe')
    browser.get("http://suninjuly.github.io/file_input.html")
   
    f_name = browser.find_element_by_xpath(r'//input[@name = "firstname"]')
    f_name.send_keys('Kate')
    
    l_name = browser.find_element_by_xpath(r'//input[@name = "lastname"]')
    l_name.send_keys('Sem')
    
    l_name = browser.find_element_by_xpath(r'//input[@name = "email"]')
    l_name.send_keys('kate@gmail.com')
    
    #file .txt creation: 
    with open("task6.txt", "w") as file:
        content = file.write("This is a file content")  
        
    current_dir = os.path.abspath(os.path.dirname(__file__))    # получаем путь к директории текущего исполняемого файла 
    file_path = os.path.join(current_dir, 'task6.txt')    
    
    
    send_file = browser.find_element_by_xpath(r'//input[@type = "file"]')
    send_file.send_keys(file_path)
    
    button = browser.find_element_by_xpath(r'//button[@type = "submit"]')
    button.click()


finally:
    time.sleep(30)
    browser.quit()
