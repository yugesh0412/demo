Feature:Insta web Testing
 @1 @3
 Scenario: Login test
   Given open the browser
   Then  enter the url
   When  enter the username
   And   enter the password
   Then  click the login button
   And   click the create the new account button
   Then  enter the alldetails
   And   click the submitButton
   Then  click the AlreadyButton
   And   enter the mobile
   And   click the continueButton
 @2 @3
 Scenario Outline: verify the login page
   Then enter the url
   When enter the username "<username>"
   And  enter the password "<password>"
   Then click the login button
   Then verify the login result

   Examples:
   |username | password|
   |yugesh   | yugesh@1234|
   |Alex     | 8764@yugesh|
   |gowtham  | yugesh@1234|
   |kabilan  | 8764@yugesh|

