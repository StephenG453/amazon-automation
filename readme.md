# amazon-automation:
This is a quickly built Selenium-Cucumber automation framework written in java to automate
basic End-to-End functionality of Amazon.com  

## Project setup:
1. Once this project is cloned into your local, run a maven clean/install to refresh the project
2. Download a chromedriver version that compatible with your current google chrome version here : https://chromedriver.chromium.org/downloads
3. inside BaseTest.java , adjust "System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");" to point to
   the location of chromedriver on your local machine

### Notes

- This framework can easily be added into a CI/CD server like Team City or Jenkins with
  user friendly and concise reporting (see jenkinsFile.groovy for a working example)