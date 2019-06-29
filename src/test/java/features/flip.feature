Feature:  Flipcart Application

@BrowserLaunch
  Scenario Outline: Login into Flipcart application
  
  	Given I launch flipcart login url
    When I input <UserName> and <password>
    And I press on login button
    Then I am able to successfully land home page
    
    Examples:
    
    |UserName   |password  |
    |6364444460 |Sridhar905|

   
   @SearchingMobileBrand
   Scenario Outline: Searching for mobile based on brand and result is sorted by relevance
  
  	Given I launch flipcart login url
    When I input <UserName> and <password>
    And I press on login button
    And I search for the mobile brand as <mobileBrand>
    Then I am able to see the phones sorted by relevance

    Examples:
    
    |UserName   |password  |mobileBrand|
    |6364444460 |Sridhar905|Samsung    |
    
        
   @SortingOptions
   Scenario Outline: Sorting the mobiles displayed based on popularity
  
  	Given I launch flipcart login url
    When I input <UserName> and <password>
    And I press on login button
    And I search for the mobile brand as <mobileBrand>
    And click on popularity sorting option
    Then I am able to view the items sorted by popularity
  	

    Examples: 
    
    |UserName   |password  |mobileBrand|sortingOption|
    |6364444460 |Sridhar905|Samsung		 |					 	 |
    
    @SortByHighPrice
    Scenario Outline: Sorting the mobiles displayed based on high to low price
  
  	Given I launch flipcart login url
    When I input <UserName> and <password>
    And I press on login button
    And I search for the mobile brand as <mobileBrand>
    And click on high to low price sorting option
    Then I am able to view the items sorted by highest price

    Examples: 
    
    |UserName   |password  |mobileBrand|
    |6364444460 |Sridhar905|Samsung    |
    
    
    @SortByNewestFirst
    Scenario Outline: Sorting the mobiles displayed based NewestFirst
  
  	Given I launch flipcart login url
    When I input <UserName> and <password>
    And I press on login button
    And I search for the mobile brand as <mobileBrand>
    And click on newest price sorting option
    Then I am able to view the items sorted by newest first
  	

    Examples: 
    
    |UserName   |password  |mobileBrand|
    |6364444460 |Sridhar905|Samsung		 |
    
    
    @SortByLowPriceAndOrder
    Scenario Outline: Sorting the Mobiles displayed based on high to low price 
  
  	Given I launch flipcart login url
    When I input <UserName> and <password>
    And I press on login button
    And I search for the mobile brand as <mobileBrand>
    And I click on low to high price sorting option
		And I select the phone for purchase
		And I enter the <pincode> for delivery
		Then verify if the mobile is available to get shipped in the area

    Examples: 
    
    |UserName   |password  |mobileBrand|pincode|
    |6364444460 |Sridhar905|pixel			 |560076 |
   
   
    @DeliveryDateLessThan2Days
    Scenario Outline: Verify if Delivery date is less than 2 days and if yes, add to cart
  
  	Given I launch flipcart login url
    When I input <UserName> and <password>
    And I press on login button
    And I search for the mobile brand as <mobileBrand>
    And I click on low to high price sorting option
		And I select the phone for purchase
		And I enter the <pincode> for delivery
		And check the delivery date is less than 2 days
		Then I add the product to cart
		
		 Examples: 
    
    |UserName   |password  |mobileBrand|pincode|
    |6364444460 |Sridhar905|pixel			 |560076 |
   
		
    
    
    