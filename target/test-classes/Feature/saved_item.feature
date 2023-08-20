Feature: saved item functionality					 
 						
 						
@tag1  
Scenario: verify save items page

Given user on save itempage
When click on companies
Then verify save companies

@tag10  
Scenario: verify share function after saved any company

When click on save company 
Then verify share icon functionality


@tag11 
Scenario: verify unsave function after saved any company

When click on save company 
Then verify unsave functionality


@tag2  
Scenario: verify save items page

Given user on save itempage
When click on  saved_news
Then verify save  news list
 
 
@unsave_news
Scenario: verify unsave function after saved any news

When click on save news 
Then verify unsave functionality 

@unshare_news
Scenario: verify unsave function after saved any news

When click on save news  
Then verify share icon functionality
 
 
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
 
 
 
 