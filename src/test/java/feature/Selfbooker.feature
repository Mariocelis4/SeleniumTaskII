Feature:
  Known user should sign in
  User should schedule a round trip flight

  Scenario:
    Given User enters page and has credentials
    When Enters user name as mercury and enter user password as mercury
    Then Access flight information page

    And Choose flight type as roundtrip
    And Choose number passenger
    And Choose departing airport
    And Choose departing date
    And Choose arriving airport
    And Choose arriving date
    And Choose service class
    And Choose airline preference
    Then Access flight options page

    And Choose depart flight
    And Choose return flight
    Then Access passengers info page

    And Enter passengers info
    And Enter payment info
    And Enter billing address
    And Enter delivery address
    Then Access complete flight details page