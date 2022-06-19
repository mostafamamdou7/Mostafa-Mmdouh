@smoke

  Feature: User could search for any item

 Background:  User navigates to google website

    Scenario: user can search for any item by item's name
      When user press on search field
      And user search with Item name"InstaBug"
      And user press on search button
      Then user could find relative result

