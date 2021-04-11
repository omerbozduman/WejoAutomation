@wejo @overview
Feature: Why Wejo Page - Overview sub module

  @positive
  Scenario: verify start your journey form under overview sub module with valid credentials

    Given I open Wejo website
    And I verify page title is "Wejo | The global leader in connected car data"
    Then I click "Overview" submodule under "Why Wejo" module
    And I verify "Start your journey" is displayed
    Then I fill the form with valid data
    And I click the Submit button
    Then I verify form success message "Your request for information has been submitted, we will be in touch shortly." is displayed

