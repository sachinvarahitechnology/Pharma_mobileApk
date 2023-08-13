Feature: Homepage functionality 
    
@tag1
Scenario: validate marketplace is clickable 
   
Given user on login page & login
When  user on homepage
When  click on marketplace
Then  verify feature is open

@tag2
Scenario: validate event is clickable 
   
Given user on login page & login
When  user on homepage
When  click on event
Then  verify event feature is open

@tag3
Scenario: validate news is clickable 
   
Given user on login page & login
When  user on homepage
When  click on news
Then  verify news feature is open

@tag4
Scenario: validate blogs is clickable 
   
Given user on login page & login
When  user on homepage
When  click on blogs
Then  verify blogs feature is open

@tag5
Scenario: validate jobs is clickable 
   
Given user on login page & login
When  user on homepage
When  click on jobs
Then  verify job feature is open

@tag6
Scenario: validate manubar is clickable 
   
Given user on login page & login
When  user on homepage
When  click on menu
#Then  verify menu feature is open





 