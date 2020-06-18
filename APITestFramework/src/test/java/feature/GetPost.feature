Feature: Testing REST API
  user should able to submit GET and POST requests to a webservice

  Scenario Outline: Verify user transaction
    Given for the <parameter> <value>
    When the GET request returns status <status>
    Then verify <Key> value is <value1>
    Examples:
      | parameter | value | status | Key        | value1 |
      | "userId"  | "2"   | 200    | "per_page" | 10     |
    Examples:
      | parameter | value | status | Key        | value1 |
      | "userId"  | "2"   | 200    | "per_page1" | 10     |

  Scenario Outline: Verify Customer registration
    Given for <Name> with EmailId <EmailId> create registration as <UserName> <Password>
    When the GET request returns status <status>
    Then verify response with <SuccessCode> as <ExpectedSuccessValue> or <FailureCode> as <ExpectedFailureValue>
    Examples:
      | Name                 | EmailId       | UserName   | Password   | status | SuccessCode   | ExpectedSuccessValue | FailureCode | ExpectedFailureValue        |
      | "FirstName LastName" | "ppp@xxx.com" | "UserName" | "Password" | 200    | "SuccessCode" | "OPERATION_SUCCESS"  | "fault"     | "FAULT_USER_ALREADY_EXISTS" |

  Scenario Outline: Verify Customer registration with Json file
    Given for given <jsonFile> create registration
    When the GET request returns status <status>
    Then verify response with <SuccessCode> as <ExpectedSuccessValue> or <FailureCode> as <ExpectedFailureValue>
    Examples:
      | jsonFile        | status | SuccessCode   | ExpectedSuccessValue | FailureCode | ExpectedFailureValue        |
      | "Customer.json" | 200    | "SuccessCode" | "OPERATION_SUCCESS"  | "fault"     | "FAULT_USER_ALREADY_EXISTS" |
