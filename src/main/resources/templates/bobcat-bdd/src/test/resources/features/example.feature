Feature: Wikipedia I want to open main page and search for hello world

  Scenario: Search for hello world
  Given I have opened main page
  When I search for "hello world"
  Then Heading for page will be ""Hello, World!" program"
