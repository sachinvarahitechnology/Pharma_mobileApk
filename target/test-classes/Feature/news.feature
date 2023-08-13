Feature: news functionality

Background:
 						Given user on news page 
 						
 						
@tag1  
Scenario: verify news functionality and news visible by category

When click on any news
Then validate click news is open or not

@save  
Scenario: verify save functionality in news

When click on any news
Then validate save functioanlity

@search  
Scenario: verify search functionality by title in news

When click search icon
Then validate search  functioanlity

@newsdatetime 
Scenario:
  verification of news seen with time
    
When click on any news
Then visible with time

@search_cat  
Scenario: verify search functionality by category name in news

When click search icon
Then validate search  functioanlity by category name


@scrolling  
Scenario:
  verification of today news scroll or not
  
When todaynews is scroll

@share  
Scenario: verify share functionality in news

When click on any news
Then validate share functioanlity


@tag4  #check once create a problem
Scenario:
  verification of news is clickable all category
  
When  select category and click it

