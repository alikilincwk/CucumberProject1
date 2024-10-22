Feature: Login Feature

  Background:
    Given Navigate to ParaBank Website

  Scenario: Login

    And Click on the Element in LeftNav
      | register |
    And User registers and send random keys in LeftNav
    And Click on the Element in LeftNav
      | loginButton |
    Then Login Message Should be Displayed
      | welcome |

  Scenario: Negative Login

    And User send random keys in LeftNav
    And Click on the Element in LeftNav
      | loginButton |
    Then Error Message Should be Displayed
      | error |
