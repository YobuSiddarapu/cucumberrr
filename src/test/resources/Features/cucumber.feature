Feature: Feature to test Login functionality


Scenario: login home page

Given user given valid credentials
When user given username"yobu2252.marolix@gmail.com"
And user given password"123456789"
And click the login button
Then user into the home page

