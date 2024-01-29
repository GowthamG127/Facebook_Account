Feature: Create a new Facebook account

Scenario: Enter new user details in the signup page on facebook website

Given  Launch Firefox Browser and maximize the window

When Pass the Url of the facebook login page

And Mousehover to click Signup for Facebook and click on it

And Signup page will be open

And To pass the first name in the first name textbox
|gowtham|gokul|michel|

And To pass the surname in the surname textbox
|robert|antony|ajith|

And To pass the mobile number or email address int the email field
|9788448897|gowtham@gmail.com|9788665890|
|gokulsichar@gmail.com|ajithnuar@gmail.com|6780973340|

And To pass a password in the password field
|hbbv345srd|jk09kj8vjhgy8|mkihub678|

And Select your birthday in the day dropdown box

And Select your birth month in the month dropdown box

And Select your birth year in the year dropdown box

And Select your gender by clicking the respective radio button

Then To close the entire browser