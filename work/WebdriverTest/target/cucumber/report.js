$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('dataTable\dataTable.feature');
formatter.feature({
  "line": 2,
  "name": "Data table",
  "description": "Verify that the new user registration is successful after passing correct inputs.",
  "id": "data-table",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "data-table;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the user on the user registration page.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter invalid data on the page",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 7
    },
    {
      "cells": [
        "First Name",
        "Sumita"
      ],
      "line": 8
    },
    {
      "cells": [
        "Last Name",
        "Pandey"
      ],
      "line": 9
    },
    {
      "cells": [
        "Email Address",
        "someone@gmail.com"
      ],
      "line": 10
    },
    {
      "cells": [
        "Re-enter Email Address",
        "someone@gmail.com"
      ],
      "line": 11
    },
    {
      "cells": [
        "Password",
        "PASSWORD"
      ],
      "line": 12
    },
    {
      "cells": [
        "Birthdate",
        "02"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the user registration should be successful.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});