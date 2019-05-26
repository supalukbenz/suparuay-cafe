Feature: Add order
  As a customer
  I want to buy items in cafe
  so that I can add items in order.

Background:
  Given I have Mocha already in coffee order.
  Given I have Brookie already in dessert order.


Scenario: Add same coffee order and 1 other dessert order.
  When I add Mocha coffee order.
  When I add Latte coffee order.
  Then The number of orders should be 4.
  When The total should be 360.
