Feature: Login functionality
  @test1
  Scenario: 1 Successful Login
    #Given I am on the Sauce Demo Login Page //( this step i had used from my common method class in open browser method )
    When I fill the account information for account StandardUser into the Username field and the Password field
    And I click the Login Button
    Then I am redirected to the Sauce Demo Main Page and I verify the App Logo exists

  #Scenario: 2 Failed Login
   # Given I am on the Sauce Demo Login Page
    # When I fill the account information for account LockedOutUser into the Username field and the Password field
    # And I click the Login Button
    # Then I verify the Error Message contains the text "Sorry, this user has been banned."




  @test2
  Scenario Outline: 2 Failed Login
    When I fill the account information for account LockedOutUser into the Username field "<username>" and "<password>" and verify the Error Message contains the text "<error>"
    Examples:

      | username | password | error |
      |locked_out_user |secret_sauce |Sorry, this user has been banned.|
