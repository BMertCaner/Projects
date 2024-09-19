
Feature: Ziraat Calculation Tool
  Description: The purpose of this feature is to test calculation method for credit

  @chrome @ziraat
  Scenario Outline: : calculate consumer credit at calculation tool - chrome

    Given I launch "<browser>" browser with ziraat
    Then I verify that the calculation tool web site is presented on the page

    When I click consumer credit page
    #Then I verify that consumer credit is presented on the page

    When I fill the form and click calculation button on the page "<amount>""<time>""<rate>"
    Then I verify that interest calculation result is showed on the page "<installmentamount>""<interestRate>""<totalCostRate>"

    Examples:
      | browser | amount | time | rate | installmentamount | interestRate | totalCostRate |
      | chrome | 100 | 12 | 4 | 11,41 TL | % 4,00 | % 85.9036 |


  @firefox @ziraata
  Scenario Outline: : calculate consumer credit at calculation tool - firefox

    Given I launch "<browser>" browser with ziraat
    Then I verify that the calculation tool web site is presented on the page

    When I click consumer credit page
    Then I verify that consumer credit is presented on the page

    When I fill the form and click calculation button on the page "<amount>""<time>""<rate>"
    Then I verify that interest calculation result is showed on the page "<installmentamount>""<interestRate>""<totalCostRate>"

    Examples:
      | browser | amount | time | rate | installmentamount | interestRate | totalCostRate |
      | firefox | 100 | 12 | 4 | 11,41 TL | % 4,00 | % 85.9036 |








