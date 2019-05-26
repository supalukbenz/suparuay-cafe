Feature: Add topping to coffee order
  As a customer
  I want to add topping
  so that I can add topping into coffee order

Background:
  Given I have Mocha already in coffee order.

Scenario: Add coffee orders and topping to them
  When I add Latte coffee order.
  Then The total should be 195.
  When I want to add Cappucino coffee to order and add the Whip Cream topping
  Then The price for this coffee from adding topping should be 120.
  Then The total should be 315.
