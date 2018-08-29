
@tag
Feature: Products of Merchant

  @tag1
  Scenario: Merchant Particular Products
    Given I open buisness analysis page
    When I click on Merchant Products
    And enter Merchant name
    Then Products of that particular merchant should be displayed
    

