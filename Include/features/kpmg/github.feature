
Feature: Title of your feature
 I want run the github application

  Scenario: TC_001_Verify that user able to access sites
    Given I want to open browser
    When user wants to enter the email address and password and click on login button
    Then user wants to click on sing up button and needs to enter name email and password and confirmpassword

  Scenario: TC_002_Verify that if user login with invaild credentials
    Given I want to open browser
    When User wants to enter any invaild email id and invalid password and click on login button
    
  Scenario: TC_003_Verify with Blank Username and Password in Login page
    When User should be able to see an error message is displayed indicating that both fields are required to login.
    
  Scenario: TC_004_Verify Signup page
   When user should be able to enter name email id and password confirm password and click submit button
   
  Scenario: TC_005_Verify the vaildation of Email id field
   When user able to enter invalid email id name and invalid passwordand confirmpassword clicksubmit button
   
    
  