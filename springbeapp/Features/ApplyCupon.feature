
@tag
Feature: Applycoupon
  I want to use this template for my feature file

  @tag1
  Scenario: Apply coupon
    Given I open products page
    And select a particular product 
      When i enter coupon code
   Then i select applycoupon
  Then if the coupon is valid coupon should be applied
    

 