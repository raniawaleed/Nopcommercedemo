@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user could login with valid email and password

  Given userr go to login page
 When userr login with valid email "tests@example.com"
  And userr  should enter valid password "P@ssw0rd"
  And userr press on login button
  Then userr login to the system successfully

  Scenario: user could login with invalid email and password

  Given userr go to login page
  When userr login with invalid email "wrong@example.com"
  And userr enter valiid "P@ssw0rd"
  And userr press on login button
  Then userr could not login to the system
