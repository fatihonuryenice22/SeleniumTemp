Feature: FlyPgs
  Scenario: Buying Plane Tickets
    Given User is on Flypgs site
    When Accept cookies
    When Select One way flight
    When Select from location
    When Type IGA
    When Select Istanbul airport
    When Select to location
    When Type Izmir
    When Select Izmir airport
    When Click to Search flights button
    When Click to Filter icon
    When Search Price option
    When Select the first object