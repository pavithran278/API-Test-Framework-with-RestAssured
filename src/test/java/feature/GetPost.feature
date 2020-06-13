Feature: Testing REST API
  user should able to submit GET and POST requests to a webservice

  Scenario: Verify user transaction
    Given Perform GET operation for "userId" "2" to get "UserStatus"
#    And Perform GET for the user "2" with parameter "userId"
    Then Check "per_page" value is "10"