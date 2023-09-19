Feature: event Functionality 
 
Background:
 						Given user on event page
 						
@title_date  
Scenario: verify event functionality with title and date

When click on any event 
Then validate click event is open or not


@share  
Scenario: verification of internal share functionality

When click on any event 
Then validate share functionality

@save
Scenario: verification of internal save functionality

When click on any event 
Then validate save functionality 


@save_external
Scenario: verification of external save functionality

Then validate save_external functionality

@search
Scenario: verification of search functionality

When use search functionality  
Then validate as per search functionality
 
@date_time 
Scenario: verification of event visible with date & event name
 
Then verify event is display with date
 
 
@tag1 #need to check sometime not working   
Scenario: verification of Allevent is clickable 
   
Then verify all event is clickable

 
 
