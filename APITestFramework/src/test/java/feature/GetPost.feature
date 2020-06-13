Feature: Testing REST API
  user should able to submit GET and POST requests to a webservice

  Scenario: Verify user transaction
    Given for the "userId" "2"
    When the GET request returns status 200
    Then verify "per_page" value is 10