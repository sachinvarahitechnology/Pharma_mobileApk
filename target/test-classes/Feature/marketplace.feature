Feature: Marketplace functionality

#Background: Given user on marketplace page 


@product_alphabet
Scenario: verification product list by alphabets

When click on any category
Then verify sort by functionality
Then validate as per alphabet product is coming or not


@location
Scenario: verification of search by location functionality in marketplace  

When click on search
Then validate search functionality by location


@rating
Scenario: verification of rating functionality in marketplace 
Given user on marketplace page
When click on any category 
When click on any company
Then verify rate functionality

@sort   
Scenario:  verification of sort by functionality in market place 

 
When click on any category
Then verify sort by functionality

@feature  
Scenario: verification of feature companies is clickable 

When click on any feature company
Then validate did the one clicked open
 
 
@name
Scenario: verification of search by company name functionality in marketplace  
 
When click on search
Then validate search functionality

@mail   
Scenario: verification of mail functionality in marketplace company

When click on any category 
When click on any company
Then validate mail functionality

@chat  
Scenario: verification of chat functionality in marketplace company

When click on any category 
When click on any company
Then validate chat functionality


@product
Scenario: verification of search by product name functionality in marketplace  

When click on search
Then validate search functionality by product name


@save
Scenario: verification of save functionality in marketplace  

Given user on marketplace page 
When click on any category 
When click on any company
When validate save functionlity
Then check this save company is come in saved_company list or not
 
 
@tag10 #check once
Scenario: verify all category is clickable

When click on every category



