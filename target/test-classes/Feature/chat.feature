Feature: Chat Functionality 


@tag1  
Scenario: verify message send properly or not

Given user on chat page
When open company
Then text it and verify

@tag2  
Scenario: verify message delete or not

Given user on chat page
When open company
Then  verify delete
 