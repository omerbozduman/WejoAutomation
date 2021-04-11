@wejo @products
Feature: Products & Services

  Scenario: verify products types

    Given I open Wejo website
    And I verify page title is "Wejo | The global leader in connected car data"
    Then I click "Products" submodule under "Products & Services" module
    And I verify page sub title "Our products" is displayed
    Then I verify below product are displayed
    |Wejo Journey Intelligence|
    |Wejo Traffic Intelligence|
    |Vehicle movements        |
    |Driving events           |
