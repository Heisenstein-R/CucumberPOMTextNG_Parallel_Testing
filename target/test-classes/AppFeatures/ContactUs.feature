Feature: Contact Us page Testing

  Scenario Outline: User Fills the form and submits it
    Given user is on the ContactUs page
    When user enters fills the and submits data from the "<SheetName>" and <RowNumber>
    Then user see a form submitting confirmation message

    Examples: 
      | SheetName | RowNumber |
      | ContactUS |         0 |
      | ContactUS |         1 |
