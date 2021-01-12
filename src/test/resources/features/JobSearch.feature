Feature: User can search for a job on homepage
  Go to link: https://www.cv-library.co.uk/

@Regression
  Scenario Outline: Job Search with More options
    Given User is on CV-Library Homepage
    When User Enters "<JobTitle>"  "<Location>" and selects <Distance> miles
    And User clicks on More Options
    And Enters <Min_Salary> , <Max_Salary> , "<Salary_Type>" and "<JobType>"
    And Clicks on FindJobs button
    Then verify search results are displayed with "<JobTitle>"

    Examples: 
      | JobTitle    | Location | Distance | Min_Salary | Max_Salary | Salary_Type | JobType   |
      | Software Qa | London   |        2 |      40000 |      50000 | month       | Permanent |



 