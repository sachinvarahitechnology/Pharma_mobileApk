Feature: saved item functionality					 
 						
 						
@tag1  
Scenario: verify save items page

Given user on save itempage
When click on companies
Then verify save companies

@tag2  
Scenario: verify save items page

Given user on save itempage
When click on  saved_news
Then verify save  news list
 
 
@tag3  
Scenario: verify save items page

Given user on save itempage
When click on Saved_Events
Then verify save event list

@tag4  
Scenario: verify save items page

Given user on save itempage
When click on saved_Blogs
Then verify save blog list

@tag5  #pending this point bcz no joblist is present in job
Scenario: verify save items page

Given user on save itempage
When click on saved_Jobs
Then verify save Job list
 
 
 
 