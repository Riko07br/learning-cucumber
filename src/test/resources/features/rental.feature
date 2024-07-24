Feature: Rent movies
  As user
  I want to register movie rentals
  To control prices and dates

  Scenario: Must rent a movie successfully
    Given movie with 2 units in stock
    And rent price of R$ 3.0
    When rent
    Then rent price is R$ 3.0
    And return date is in 1 day
    And movie stock is 1 unit

  Scenario: Should not be able to rent a movie without stock
    Given movie with 0 units in stock
    When rent
    Then won't be able to rent
    And movie stock is 0 unit

  Scenario: Must give special conditions to extended category
    Given movie with 2 units in stock
    And rent price of R$ 3.0
    And rent of type special
    When rent
    Then rent price is R$ 6.0
    And return date is in 3 days