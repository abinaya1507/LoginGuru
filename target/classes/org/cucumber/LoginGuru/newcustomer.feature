Feature: To add new customer

  Scenario: Test with valid credentials
  
    Given User is in Guru Home page
    When User logins with valid credentials
    Then User must be in Manager Home page
  
  
  Scenario: To add new customer run n number of rows of examples
    Given User is in Guru Manager Home page
    And The user navigates to new customer page
    When The user fill the customer details
      | Customer Name | Gender | DOB        | Address        | city    | state     | pin    | phone      | email                 | password |
      | Abinaya       | female | 15-07-1992 | No2 Perungudi | Chennai | Tamilnadu | 600096 | 9549822568 | abinaya1507@gmail.com | abi1992  |
    And user clicks submit button in add customer page
    Then The user should see the sucessfull message
    
    
