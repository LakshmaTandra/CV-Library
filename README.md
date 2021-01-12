# CV-Library
CV-library 

BDD- Cucumber Project using Java

CV-Library Selenium BDD project 

Project Repository:

Clone project from GitHub Repository : 
         https://github.com/LakshmaTandra/CV-Library


Tests Execution:

scenario  marked with @Regression tags. 
Tests configured to Run on Chrome Browser.

Install the maven.
Open terminal navigate to project folder: $ cd <ProjectName>
Run command:  $ mvn clean verify

Project_framework:
Behavioural driven development automation framework using selenium, cucumber-java, Junit, maven.
Tools and technologies used:
Language: Java
Testing framework: Junit
BDD framework: Cucumber-jvm
Automation tool: Selenium Webdriver
Build tool: maven
Reporting: cucumber reporting

Features of the framework
BDD framework using Cucumber-jvm. Feature files can be written easily using Given,When, Then etc.
Browser(Chrome/ Firefox/Edge) can be configured in config.properties file.
Url is configured in config.properties file.
Html report gets generated after each test run and can be found /target folder.



package: features : It contains all Features and Scenarios defined in .feature file.



package:StepDefinitions: Contains browser Setup , Test-steps and Teardown methods.



TestRunner.java : Features/tests to be executed are defined in this class. Other test configurations are also defined here.



package: pages : It has web elements corresponding to the specific page which is used by StepDefinitions.







Test report:

 View the test results in browser

