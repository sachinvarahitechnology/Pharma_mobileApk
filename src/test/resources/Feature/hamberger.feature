Feature: hamberger menu Functionality 

 
@tag1  
Scenario: verify rate companies functionality

Given user on manu page
When click on rate companies
Then verify rate companies
 
@tag2
Scenario: verify  following functionality

Given user on manu page
When click on following
Then verify all following


@tag3
Scenario: verify  notification functionality

Given user on manu page
When click on setting
When click on notification
Then verify notification

@tag4
Scenario: verify  change password functionality

Given user on manu page
When click on setting
When click on change_password
#Then verify change password functionality

@tag400
Scenario: verify alert functionality

Given user on manu page
When click on setting
When click on alert
Then verify alert

@rate_us
Scenario: verify rate_us functionality

Given user on manu page
When click on setting
When click on  rateus
Then verify play store aap open or not


@privacypolicy
Scenario: verify privacy_policy functionality

Given user on manu page
When click on setting
When click on  privacy_policy
Then verify it is opne or not


@Help
Scenario: verify  help functionality

Given user on manu page
When click on help
Then verify help page is open or not


@tag22
Scenario: verify  Contact US functionality

Given user on manu page
When click on contact us

@sign_out
Scenario: verify  SignOUT functionality

Given user on manu page
When click on sign out
Then verify account is signout