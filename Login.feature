
@tag
Feature: Demo Guru Login
 

 @tag1 
  Scenario: Test with valid credentials
  
    Given User is in Guru Home page
    When User logins with valid credentials
    Then User must be in Manager Home page
   
 