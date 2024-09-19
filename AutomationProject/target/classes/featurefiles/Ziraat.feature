
Feature: Ziraat Calculation Tools
  Description: The purpose of this feature is to test calculation method for credit

  @chrome @ziraat
  Scenario Outline: : calculate consumer credit at calculation tool - chrome

    Given I launch "<browser>" browser with ziraat
    Then I verify that the calculation tool web site is presented on the page

    When I click consumer credit page
    Then I verify that consumer credit is presented on the page

    When I fill the form and click calculation button for consumer credit on the page "<amount>""<time>""<rate>"
    Then I verify that consumer credit result is showed on the page "<installmentamount>""<interestrate>""<totalcostrate>"

    Examples:
      | browser | amount | time | rate | installmentamount | interestrate | totalcostrate |
      | chrome | 100 | 12 | 4 | 11,41 TL | % 4,00 | % 85.9036 |

  @chrome @ziraat
  Scenario Outline: : calculate deposit yield calculation at calculation tool - chrome

    Given I launch "<browser>" browser with ziraat
    Then I verify that the calculation tool web site is presented on the page

    When I click deposit yield calculation page
    Then I verify that deposit yield calculation is presented on the page

    When I fill the form and click calculation button for usd deposit yield calculation on the page "<time>""<amount>"
    Then I verify that deposit yield calculation result is showed on the page "<maturityamount>""<interestrate>"

    Examples:
      | browser | time | amount | maturityamount | interestrate |
      | chrome | 100 | 1200 | 1.200,98 | % 0,4 |

  @chrome @ziraat
  Scenario Outline: : calculate iban calculation at calculation tool - chrome

    Given I launch "<browser>" browser with ziraat
    Then I verify that the calculation tool web site is presented on the page

    When I click iban calculation page
    Then I verify that iban calculation is presented on the page

    When I fill the form and click calculation button for iban calculation on the page "<branch>""<customerno>""<annexno>"
    Then I verify that deposit yield calculation result is showed on the page "<ibanno>"

    Examples:
      | browser | branch | customerno | annexno | ibanno |
      | chrome | GAYRETTEPE/İSTANBUL ŞUBESİ-(915) | 12345678 | 1234 | TR170001000915123456781234 |

  @firefox @ziraat
  Scenario Outline: : calculate consumer credit at calculation tool - firefox

    Given I launch "<browser>" browser with ziraat
    Then I verify that the calculation tool web site is presented on the page

    When I click consumer credit page
    Then I verify that consumer credit is presented on the page

    When I fill the form and click calculation button for consumer credit on the page "<amount>""<time>""<rate>"
    Then I verify that consumer credit result is showed on the page "<installmentamount>""<interestrate>""<totalcostrate>"

    Examples:
      | browser | amount | time | rate | installmentamount | interestrate | totalcostrate |
      | firefox | 100 | 12 | 4 | 11,41 TL | % 4,00 | % 85.90367 |

  @firefox @ziraatt
  Scenario Outline: : calculate deposit yield calculation at calculation tool - firefox

    Given I launch "<browser>" browser with ziraat
    Then I verify that the calculation tool web site is presented on the page

    When I click deposit yield calculation page
    Then I verify that deposit yield calculation is presented on the page

    When I fill the form and click calculation button for usd deposit yield calculation on the page "<time>""<amount>"
    Then I verify that deposit yield calculation result is showed on the page "<maturityamount>""<interestrate>"

    Examples:
      | browser | time | amount | maturityamount | interestrate |
      | firefox | 100 | 1200 | 1.200,98 | % 0,4 |

  @firefox @ziraatt
  Scenario Outline: : calculate iban calculation at calculation tool - firefox

    Given I launch "<browser>" browser with ziraat
    Then I verify that the calculation tool web site is presented on the page

    When I click iban calculation page
    Then I verify that iban calculation is presented on the page

    When I fill the form and click calculation button for iban calculation on the page "<branch>""<customerno>""<annexno>"
    Then I verify that deposit yield calculation result is showed on the page "<ibanno>"

    Examples:
      | browser | branch | customerno | annexno | ibanno |
      | firefox | GAYRETTEPE/İSTANBUL ŞUBESİ-(915) | 12345678 | 1234 | TR170001000915123456781234 |











