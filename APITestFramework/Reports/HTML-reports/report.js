$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/GetPost.feature");
formatter.feature({
  "name": "Testing REST API",
  "description": "  user should able to submit GET and POST requests to a webservice",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify user transaction",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "for the \u003cparameter\u003e \u003cvalue\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "the GET request returns status \u003cstatus\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "verify \u003cKey\u003e value is \u003cvalue1\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "parameter",
        "value",
        "status",
        "Key",
        "value1"
      ]
    },
    {
      "cells": [
        "\"userId\"",
        "\"2\"",
        "200",
        "\"per_page\"",
        "10"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify user transaction",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "for the \"userId\" \"2\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.GetPostSteps.performGETOperationFor(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the GET request returns status 200",
  "keyword": "When "
});
formatter.match({
  "location": "steps.GetPostSteps.theGETRequestReturnsStatus(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"per_page\" value is 10",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.GetPostSteps.checkValueIs(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "parameter",
        "value",
        "status",
        "Key",
        "value1"
      ]
    },
    {
      "cells": [
        "\"userId\"",
        "\"2\"",
        "200",
        "\"per_page1\"",
        "10"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify user transaction",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "for the \"userId\" \"2\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.GetPostSteps.performGETOperationFor(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the GET request returns status 200",
  "keyword": "When "
});
formatter.match({
  "location": "steps.GetPostSteps.theGETRequestReturnsStatus(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"per_page1\" value is 10",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.GetPostSteps.checkValueIs(java.lang.String,int)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c10\u003e but was:\u003cnull\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat steps.GetPostSteps.checkValueIs(GetPostSteps.java:33)\r\n\tat ✽.verify \"per_page1\" value is 10(file:///C:/Users/Akatsuki/eclipse-workspace/APITesting/src/test/java/feature/GetPost.feature:7)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "name": "Verify Customer registration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "for \u003cName\u003e with EmailId \u003cEmailId\u003e create registration as \u003cUserName\u003e \u003cPassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "the GET request returns status \u003cstatus\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "verify response with \u003cSuccessCode\u003e as \u003cExpectedSuccessValue\u003e or \u003cFailureCode\u003e as \u003cExpectedFailureValue\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "EmailId",
        "UserName",
        "Password",
        "status",
        "SuccessCode",
        "ExpectedSuccessValue",
        "FailureCode",
        "ExpectedFailureValue"
      ]
    },
    {
      "cells": [
        "\"FirstName LastName\"",
        "\"ppp@xxx.com\"",
        "\"UserName\"",
        "\"Password\"",
        "200",
        "\"SuccessCode\"",
        "\"OPERATION_SUCCESS\"",
        "\"fault\"",
        "\"FAULT_USER_ALREADY_EXISTS\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Customer registration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "for \"FirstName LastName\" with EmailId \"ppp@xxx.com\" create registration as \"UserName\" \"Password\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.GetPostSteps.forWithEmailidCreateRegistrationAs(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the GET request returns status 200",
  "keyword": "When "
});
formatter.match({
  "location": "steps.GetPostSteps.theGETRequestReturnsStatus(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify response with \"SuccessCode\" as \"OPERATION_SUCCESS\" or \"fault\" as \"FAULT_USER_ALREADY_EXISTS\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.GetPostSteps.verifyResponseWithAsOrAs(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify Customer registration with Json file",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "for given \u003cjsonFile\u003e create registration",
  "keyword": "Given "
});
formatter.step({
  "name": "the GET request returns status \u003cstatus\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "verify response with \u003cSuccessCode\u003e as \u003cExpectedSuccessValue\u003e or \u003cFailureCode\u003e as \u003cExpectedFailureValue\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "jsonFile",
        "status",
        "SuccessCode",
        "ExpectedSuccessValue",
        "FailureCode",
        "ExpectedFailureValue"
      ]
    },
    {
      "cells": [
        "\"Customer.json\"",
        "200",
        "\"SuccessCode\"",
        "\"OPERATION_SUCCESS\"",
        "\"fault\"",
        "\"FAULT_USER_ALREADY_EXISTS\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Customer registration with Json file",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "for given \"Customer.json\" create registration",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.GetPostSteps.forGivenCreateRegistration(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the GET request returns status 200",
  "keyword": "When "
});
formatter.match({
  "location": "steps.GetPostSteps.theGETRequestReturnsStatus(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify response with \"SuccessCode\" as \"OPERATION_SUCCESS\" or \"fault\" as \"FAULT_USER_ALREADY_EXISTS\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.GetPostSteps.verifyResponseWithAsOrAs(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});