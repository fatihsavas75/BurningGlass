Feature: Selenium Iframe Test
@smoke
  Scenario: Go to first frame and check title
    Given user opens iframe url
    And user should see 4 frames in the page
    And user scroll to second frame
    When user switch to first frame
    Then user returns to main page
    And user should see "Selenium IFrame" as a title