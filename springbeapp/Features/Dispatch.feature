
@tag
Feature: Product Dispatch Report
 
   @tag1
  Scenario: Dispatch report
    Given I open buisness analysis page
    When I click on  dispatch report
    And enter product name
    Then dispatch details of particular product should be displayed
    

  
  