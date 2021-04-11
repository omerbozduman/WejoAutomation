@wejo @newsroom
Feature: Newsroom Page

  Scenario Outline: verify newsroom page <type>

    Given I open Wejo website
    And I verify page title is "Wejo | The global leader in connected car data"
    Then I navigate to "Newsroom" module
    And I verify page title is "Newsroom | Wejo | The latest news and insights from Wejo"
    Then I click the sub module "<type>"
    And I click the first blog
    Then I verify "Share this article" text is displayed
    And I verify "<social media>" links



    Examples:

      | type         | social media              |
      | All          | LinkedIn,Twitter,Facebook |
      | News         | LinkedIn,Twitter,Facebook |
      | Blog         | LinkedIn,Twitter,Facebook |
      | White papers | LinkedIn,Twitter,Facebook |
      | Webinars     | LinkedIn,Twitter,Facebook |
      | Life at Wejo | LinkedIn,Twitter,Facebook |