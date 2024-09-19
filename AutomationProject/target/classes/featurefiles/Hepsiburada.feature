
Feature: Original Product
  Description: The purpose of this feature is to test call me for original product

  @chrome @hepsiburada
  Scenario Outline: : check the product at solution center

    Given I launch "<browser>" browser with hepsiburada
    # Then I verify that the web site is presented on the page

    When I click solution center button
    Then I verify that solution center is presented on the page

    When I click that product info on the page
    When I click that is it original on the page
    When I click that call me now on the page
    Then I verify that login page is presented on the page

    When I use "<username>" to login page
    When I use "<password>" to login pass page

    Examples:
      | username | password | browser |
      | mrtcnr10@hotmail.com    | 12345678A | chrome |

