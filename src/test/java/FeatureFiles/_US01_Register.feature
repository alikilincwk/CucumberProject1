Feature: ParaBank Website Functionality

  Background:
    Given Navigate to ParaBank Website

  Scenario Outline: User Registration

    And Click on the Element in LeftNav
      | register |
    And User send keys in Dialog
      | firstName       | <FirstName>       |
      | lastName        | <LastName>        |
      | address         | <Address>         |
      | city            | <City>            |
      | state           | <State>           |
      | zipCode         | <ZipCode>         |
      | phone           | <PhoneNumber>     |
      | ssn             | <SSN>             |
      | username        | <Username>        |
      | password        | <Password>        |
      | confirmPassword | <ConfirmPassword> |

    And Click on the Element in Dialog
      | registerButton2 |
    Then Message Should be Displayed
      | success |
    Examples:
      | FirstName | LastName  | Address      | City       | State | ZipCode | PhoneNumber | SSN         | Username         | Password     | ConfirmPassword |
      | Team2B6   | Cucumber1 | 1231 Main St | New Jersey | NJ    | 10002   | 1234567891  | 123-45-6781 | team2B6Cucumber4 | password1234 | password1234    |


