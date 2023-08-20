Feature: blog Functionality 

Background: 
						Given user on blog page

 
@tag1  
Scenario: click on any blog this blog is open or not

When click on any blog
Then varify click blog is open  

@comment  
Scenario: verify comment is posted or not

When click on any blog
Then verify comment is posted or not  


@follow  
Scenario: following functionality

When click on any blog
Then verify follow button


@blogger  
Scenario: validate about blogger name in blog

When click on any blog
When click on author name
Then velidate about blogger


@save_blog_external
Scenario: validate exteranal save any blog or not
 
Then validate saved icon

@save_blog
Scenario: validate internalsave any blog or not

When click on any blog
Then verify save functionality

@reads  
Scenario: validate about blogger name in blog

When click on any blog
When click on author name
Then validate reads of author


@tag2  
Scenario: validate author name after clicking any blog

When click on any blog
Then varify author name after clicking 


@tag3
Scenario: validate write blog link send or not

When click on write blog
Then varify link send or not


@search_blog
Scenario: validate write blog link send or not

When find by search function
Then Validate as per search


 

@share_blog
Scenario: validate internal share any blog or not

When click on any blog
Then verify share functionality