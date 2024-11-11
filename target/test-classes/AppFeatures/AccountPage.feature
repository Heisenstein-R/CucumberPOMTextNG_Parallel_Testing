Feature: Account page test/Post login page

  Background: User has already logged into the Account Page.
    Given User logs into the Account Page
      | username                    | password      |
      | rajbilieber.k3011@gmail.com | Iamrajuk@1234 |

  Scenario: verifies the page Title
    Given User is on Accounts Page
    When User verifies the title of the page
    Then Title of the Page should be "My account - My Shop"

  Scenario: Verifies the availability of buttons
    Given User is on Accounts Page
    Then User check for the availability of these links on accounts page
    |ADD MY FIRST ADDRESS|
    |ORDER HISTORY AND DETAILS|
    |MY CREDIT SLIPS|
    |MY ADDRESSES|
    |MY PERSONAL INFORMATION|
    |Home|
