Feature: Feature to test login functionality

Background: Check login is successful with valid credentials

Given Browser is open
When user write todos website link on the link bar
Then user navigate to home page of todo

Scenario: Write todo in todo bar

Given home page of todo is open 
When user write his activity todo 
And press enter
Then The activity is shown in todo list