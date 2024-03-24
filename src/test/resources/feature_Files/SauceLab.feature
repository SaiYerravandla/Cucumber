Feature: Swag labs complete order process

  Scenario Outline: Complete order process with valid credentials
    Given Launch_Browser
    When Enter_Valid_Login_Credentials "<user>"and "<pass>"
    Then Checking_Homepage
    And Add_to_Cart
    Then Logout
    
    Examples:
    |user|pass|
    |standard_user|secret_sauce|
     |problem_user|secret_sauce|
     |performance_glitch_user|secret_sauce|
     

    