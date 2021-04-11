Wejo Automation Testing Exercise / Instructions
Codes and Tests Prepared by:
Omer BOZDUMAN

Software Development in Test / Electrical&Electronic Engineer

omer.bozduman@yahoo.com

https://www.linkedin.com/in/omer-bozduman/

- Build Tool: Maven 
- Dependencies : WebDriverManager-bonigarcia , Cucumber J-Unit, Cucumber Java , Selenium
- Plugins : maven-cucumber-reporting , maven-surefire-plugin

- Test Framework: Cucumber BBD/TDD (with Junit Assertions)
- Test Framework Model: Page Object Model(POM)


WebPage uri :
https://www.wejo.com/

browser : chrome

User Stories:

Task-1- As a user I want to open Wejo website and I want to see number of "Active vehicles", "Miles curated",
"Data points", "Journeys".
   
Acceptance Criteria:
● User should open Wejo website
● "Active vehicles", "Miles curated","Data points", "Journeys" items should be displayed on homepage


Task-2- As a user I want to click "Overview" sub module under "Why Wejo" module and I want to fill the
"Start your journey" form

Acceptance Criteria:
● Overview sub module should be clickable under Why Wejo module
● "Start your journey" form should be displayed under "Overview" sub module
● Form can only accept valid informations
● Email address box should accept only company email address
● User should see the "Your request for information has been submitted, we will be in touch shortly." message 
after success submit

Taks-3- As a user I want to see the product type of Wejo

Acceptance Criteria:
● User should access products under products&services module
● Our products should be displayed after click the "products" sub module
● User should see 4 products.
|Wejo Journey Intelligence|
|Wejo Traffic Intelligence|
|Vehicle movements        |
|Driving events           |


Task-4- As a user I want to search news about Wejo under "Newsroom" module

Acceptance Criteria:
● User should 6 sub module under "Newsroom" module
All ,News ,Blog , White papers, Webinars ,Life at Wejo
● User should open the news link under related sub module
● Linkedin, Twitter, Facebook social media links should be displayed after click the related news link

System Requirements:
Java 8 + SDK
Test RUN

Notes:
To run all Scenarios, use @wejo  ,
to run task-1's scenarios use @homepage ,
to run task-1's scenarios use @overview ,
to run task-1's scenarios use @products ,
to run task-1's scenarios use @newsroom ,
tags in the CukesRunner class/Cucumber Options.

Cucumber Test Feature Scenarios:

Task-1- Statistics on HomePage  tag=@homepage
Scenario: verify statistics on homepage
Given I open Wejo website
And I verify page title is "Wejo | The global leader in connected car data"
Then I verify below statistics
      | Active vehicles | 10.7 Million |
      | Miles curated   | 354 Billion  |
      | Data points     | 9.1 Trillion |
      | Journeys        | 44.4 Billion |


Task-2- Why Wejo Page - Overview sub module tag=@overview
Scenario: verify start your journey form under overview sub module with valid credentials
Given I open Wejo website
And I verify page title is "Wejo | The global leader in connected car data"
Then I click "Overview" submodule under "Why Wejo" module
And I verify "Start your journey" is displayed
Then I fill the form with valid data
And I click the Submit button
Then I verify form success message "Your request for information has been submitted, we will be in touch shortly." is displayed

Task-3-Products & Services module-Wejo's products tag=@product
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

Task-4- Newsroom Page - news about Wejo  tag=@newsroom
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


Note-1: I execute and assert my test cases by using JUnit. I use @Before tag for access the webpage and
I use @After tag close the session in Hooks class.  

Note-2: I use Scenario-Outline for one of the scenario because the some scenario needs to execute with several datas,
so I use Scenario-Outline and Examples (Cucumber TDD) for define my test case.

Note-3: I use maven-cucumber-reporting plugin for Cucumber reports. To generate Cucumber report, execute related task's tag 
by using maven verify.

Note-4 : I used Maven as a project built management tool. It provides to run our test cases. 
I use maven verify the execute my test cases. It produces report after execution. 
Reports are under target directory.
