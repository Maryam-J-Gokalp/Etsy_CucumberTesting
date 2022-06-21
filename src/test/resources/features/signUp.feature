Feature: user sign up process

  #@wip
  Scenario: user sign up etsy home page
    Given user in on the etsy home page
    When user clicks the sign in button
    And user enters the email address into the email box
    And user click the continue button
    And user enters the firstname into the firstname box
    And user enters the password into the password box
    And user clicks the register button
    Then user should see the etsy homepage