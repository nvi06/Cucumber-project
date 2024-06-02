Feature: Login scenario
  
    Scenario: Test login page with invalid username valid password
    Given User is on login page
    When user enter invalid username and valid password
    Then user click login button
    And user get message 
    
     Scenario: Test login page with valid username invalid password
    Given User is on login Page
    When user enter valid username and Invalid password
    Then user clicked on Login button
    And User get message 
    
    Scenario: Test login page with invalid username invalid password
    Given User is on Login page
    When user enter invalid username and invalid password
    Then user clicked on login button
    And user get Message 
    
     Scenario: Test login page with blank username Blank password
    Given User is on Login Page
    When user forget to enter username and password
    Then User clicked on Login Button
    And User get popup 
    
    Scenario: Test login page with valid credentials
    Given : User is already on login page
    When : User enter username and password
    Then : User click on login button
    And : User is on home page
    
    Scenario: After Login page validate Skills on Admin Dropdown
    Given User is on Login_page and put valid credentials for login
    When user clicked on login button user relocate to home page
    And user hover on Admin dropdown
    Then user hover on Skills and click skills
    And user is on Skills page
    
    
  #@Smoke
  #Scenario Outline: Test login page with credentials
    #Given User is already on Login page
    #When Loaded "<username>" uname
    #Then Loaded "<password>" pword
    #Then User click on Login button
    #
    #Examples: 
      #| username | password | 
      #| Admin12  | Admin1   | 
      #| admin    | admin    | 
