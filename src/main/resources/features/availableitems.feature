Feature: Add item that does not exit
  As a customer
  I want to add not available item
  so that I cannot add item that does not exit to order.

Background:
  Given I have Mocha already in coffee order.
  Given I have Cake already in dessert order.

Scenario: Add does not exit item
  When I add Book coffee order.
  When I add Pen dessert order.
  Then The number of orders should be 2.
  Then The total should be 255.

