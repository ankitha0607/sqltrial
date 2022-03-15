
Feature: Data table verification

  Scenario: Data table verification
    Given I initialize the driver
    When I read the sql file for table creation
    And  I read the sql file for displaying the data in table
    And  I read the sql file for inserting data into the data table
    Then I verify the data 
    


