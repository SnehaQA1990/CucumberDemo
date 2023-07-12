Feature: OrangeHRM Login Window
    I want to use this feature file to check login functionality
    
    @setcookies
    Scenario Outline: To verify Login window
    Given Lunch Application
    When I enter '<username>' and '<password>'
    And click on Login button
    Then Dashboard should be display
    
    Examples:
       | username | password |
       | Admin    | admin123 |
       | Admin    | admin12  |
    
    
    

    
  