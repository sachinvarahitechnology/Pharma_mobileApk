Feature: Login functionality

@validlogin
Scenario Outline: validate login functionality using valid credential
 
Given  user on login page
When   user provide <username> and <password> 
And    click on button
Then   login successfully 

 Examples:
 |username                        |    password   |   
 | "sachin@varahitechnologies.com"| 	"1234566@"	|
  
 
@invalidlogin
Scenario Outline: validate login functionality using invalid username
 
Given  user on login page
When   user provide <username> and <password> 
And    click on button
Then   get error 

 Examples:
 |username                        |    password   |   
 | "sachin@varahitechnologiesc.om"| 	"1234566@"	|
 
  
@tag3
Scenario Outline: validate login functionality using invalid password
 
Given  user on login page
When   user provide <username> and <password> 
And    click on button
Then   get error 

 Examples:
 |username                        |    password   |   
 | "sachin@varahitechnologies.com"| 	"1234566"	  |

 
@tag4
Scenario Outline: validate login functionality using invalid password
 
Given  user on login page
When   user provide <username> and <password> 
And    click on button
Then   get error 

 Examples:
 |username                        |    password   |   
 | "sachin@varahitechnologies.com"| 	"1234566"	  |
 
@tag5
Scenario Outline: validate login functionality when click on remember button
 
Given  user on login page
When   user provide <username> and <password> 
When   click on remember button
And    click on button
Then   get error 

 Examples:
 |username                        |    password   |   
 | "sachin@varahitechnologies.com"| 	"1234566@"	|
 
 
@tag6
Scenario Outline: validate term and condition link
 
Given  user on login page
When   user provide <username> and <password> 
Then   validate term link

Examples:
 |username                        |    password   |   
 | "sachin@varahitechnologies.com"| 	"1234566@"	|
 

@tag7
Scenario Outline: validate id when you click on term and condition link
 
Given  user on login page
When   user provide <username> and <password> 
When   click on remember button
Then   validate term link
Then   validate id is visible
 
Examples:
 |username                        |    password   |   
 | "sachin@varahitechnologies.com"| 	"1234566@"	|



 
 
 
 
 