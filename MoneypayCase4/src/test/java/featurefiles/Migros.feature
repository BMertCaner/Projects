
Feature: Migros Product
  Description: The purpose of this feature is to test sort method for pet shop product

  @chrome @migros
  Scenario Outline: : check the product at pet shop - chrome

    Given I launch "<browser>" browser with migros
    # Then I verify that the migros web site is presented on the page

    # When I click warning
    When I click pet shop products
    Then I verify that pet shop products is presented on the page

    When I click low price sort button on the page
    Then I verify that low price is sorted on the page


    Examples:
      | browser |
      | chrome |


  @firefox @migros
  Scenario Outline: : check the product at pet shop - firefox

    Given I launch "<browser>" browser with migros
    # Then I verify that the migros web site is presented on the page

    # When I click warning
    When I click pet shop products
    Then I verify that pet shop products is presented on the page

    When I click low price sort button on the page
    Then I verify that low price is sorted on the page


    Examples:
      | browser |
      | firefox |

  @service
  Scenario Outline: : check the product service at url:

    Given I set the service url with "<service url>"
    When I call the service with type "<body>""<service type>"
    Then I verify that the response code "<response code>" is correct
    Then I verify that the response body "<response body>" is correct

    Examples:
      | service url | body | service type | response code | response body |
      | https://www.migros.com.tr/migroskop-urunleri-dt-3 | | GET | 200 | aaa |







