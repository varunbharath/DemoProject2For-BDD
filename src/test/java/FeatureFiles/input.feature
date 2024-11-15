Feature: Forms input details

  Scenario: User able to enter the details Success fully
    Given User click on Marketing Department
    And User should able to click on Sales
    And User should ble to click on Customer Service
    And  User should enter the Subject as " Software_Details"
    And User should enter the E-mail Addres as "Demo@gmail.com"
    And  User should enter the Text Box Field as "Position"
    And User should enter the Text Box - Multi Line " Easy-to-create surveys and forms "
    And User should select the dropdown
     And User Should Select the date
      When  User Click on Submitbutton

#    Given User should enter the username as "standard_user"
#    And User should enter the password as "secret_sauce"
#    When User click on login button
#    Then login should be success