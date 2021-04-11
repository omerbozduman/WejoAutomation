@wejo @homepage
Feature: HomePage

  Scenario: verify statistics on homepage

    Given I open Wejo website
    And I verify page title is "Wejo | The global leader in connected car data"
    Then I verify below statistics
      | Active vehicles | 10.7 Million |
      | Miles curated   | 354 Billion  |
      | Data points     | 9.1 Trillion |
      | Journeys        | 44.4 Billion |

