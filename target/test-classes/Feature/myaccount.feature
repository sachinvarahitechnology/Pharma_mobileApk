Feature: myaccount Functionality 


@tag1  
Scenario: verify phone number in my account

Given user on myaccount page
When enter valid number
Then verify number is correct


@tag2  
Scenario: verify position in my account

Given user on myaccount page
When enter position
Then verify position


@tag3  
Scenario: verify company name in my account

Given user on myaccount page
When enter company name
Then verify  company name

@tag4
Scenario: verify Education in my account

Given user on myaccount page
When enter education
Then verify  education
