Feature: Learn Cucumber
  As student
  I want to learn to user cucumber
  So i can automate acceptance criteria

  Scenario: Must execute the specification
    Given file created correctly
    When executed
    Then the specification returns success

  Scenario: Increment counter
    Given the value of 15
    When adding 3
    Then returns 18

  @ignore
  Scenario: Must calculate the delivery delay
    Given the delivery date of 05/04/2020
    When it delays by 2 days
    Then the delivery will be made in 07/04/2020