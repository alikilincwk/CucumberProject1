Feature: TransferFunds Functionality

  Background:
    Given Navigate to ParaBank Website

  Scenario: Create Transfer Funds

    # Given Navigate to Login Page and Enter username and password
    #And Click on the Element in LeftNav
    And User send keys in LeftNav
      | username | ademir    |
      | password | ademir123 |

    And Click on the Element in LeftNav
      | loginButton |

    Then Login Success Message Should be Displayed

    And Click on the Element in LeftNav
      | transferFunds |

    Then Transfer Page Should be Displayed

    And User send keys in Dialog
      | amount | 10 |

    And Click on the Element in Dialog
      | fromAccountSelect  |
      | fromAccountSelect1 |
      | toAccountSelect    |
      | toAccountSelect1   |
      | transferButton     |

    Then Transfer Confirmation Message

    And Click on the Element in LeftNav
      | accountsOverview |

    And Click on the Element in Dialog
      | fromAccountId |

    And Funds Transfer Transaction Received
      | lastFundsTransferReceived |

    And Amount Transaction Control


