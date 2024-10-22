Feature: TransferFunds Functionality

  Background:
    Given Navigate to ParaBank Website

  Scenario Outline: Create Transfer Funds

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
      | amount | <amount1> |

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
      | <amount1> |

    Examples:
      | amount1 |
      | 10      |


  Scenario Outline: Create Transfer Funds and verify with Id

    And User send keys in LeftNav
      | username | hayat  |
      | password | hayat1 |

    And Click on the Element in LeftNav
      | loginButton |

    Then Login Success Message Should be Displayed

    And Click on the Element in LeftNav
      | transferFunds |

    Then Transfer Page Should be Displayed

    And User send keys in Dialog
      | amount | <amount1> |

    And Click on the Element in Dialog
      | fromAccountSelect  |
      | fromAccountSelect1 |
      | toAccountSelect    |
      | toAccountSelect1   |
      | transferButton     |

    Then Transfer Confirmation Message

    And Click on the Element in LeftNav
      | accountsOverview |

    And User send keys and click in Dialog for Find Transaction Id

    Examples:
      | amount1 |
      | 500     |

