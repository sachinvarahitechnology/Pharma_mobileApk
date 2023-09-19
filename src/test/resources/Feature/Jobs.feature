Feature: Jobs Functionality 

 
@filter  
Scenario: varify job using filter functionality

Given user on job page
When click on any filter and put
Then varify result as per filter 

@share
Scenario: varify job share functionality

Given user on job page
When click on share icon

@save
Scenario: varify job save functionality

Given user on job page
When click on save icon

@save_internal
Scenario: varify job internal save functionality

Given user on job page
When click on any job 
Then click on internal save icon

@rate_us
Scenario: varify job internal rate-us functionality

Given user on job page
When click on any job 
Then verify rating functionality

@review
Scenario: varify job internal review functionality

Given user on job page
When click on any job 
Then verify review functionality


  