Feature: Verify the response of application user tries to login with different credentials

In order to verify the login
As a guest user
I have to login 

@tester
Scenario Outline:Verify the login by entering incorrect credentials

Given Load the application and navigate to Login page 
When Navigate to login page and enter incorrect "<"username" and "password">" which are incorrect
Then User should not be logged in and error message should be displayed 

Given Load the application and navigate to Login page
When Try with different "<"username" and "password">" which are also incorrect
Then User should be restricted to login 

Given Load the application and navigate to Login page 
When I tried with correct "<"username" and "password">" 
Then I should be successfully logged in
				




Examples:
|username|password|
|kgautam@pfsweb.com|India@123|
|dksingh@pfsweb.com|India@123 |
|neelima@rev.com| Jesuscom5|
