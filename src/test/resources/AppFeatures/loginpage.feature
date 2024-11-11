Feature: Login Page Testing

  Scenario: verifying the LoginPage
    Given User is on the Login Page
    When User verifies the title of the page
    Then Title of the Page should be "Login - My Shop"
    
    Scenario: Verifies Forgot Password link 
    Given User is on the Login Page
    Then User Verifies the Forgot Password link
    
    Scenario: Verifies Create Account form
    Given User is on the Login Page
    Then User verifies Create account form
    
    Scenario: User logs in with the correct credentials
    Given User is on the Login Page
    When user enters the Username "rajbilieber.k3011@gmail.com"
    And the password as "Iamrajuk@1234"
    And clicks on the login button
    Then User verifies the title of the page
    And Title of the Page should be "My account - My Shop"
    