$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('dataTable\dataTable.feature');
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters Credentials to LogIn",
  "rows": [
    {
      "cells": [
        "Tester",
        "test"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click the link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "goes to the list of products page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 11423431207,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_testuser__and_Test(DataTable)"
});
formatter.result({
  "duration": 2583421329,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 275912,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.view_all_product()"
});
formatter.result({
  "duration": 547715691,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});