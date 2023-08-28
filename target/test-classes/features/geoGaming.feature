@test
Feature: Great Odds Scenario

  Scenario Outline: Login
    Given User navigate to Great Odds HomePage
    Then  User accepts cookies
    And   Click on Login to navigate Login page
    Then  Enter "<userName>" "<password>" and click Login button
    And  Click on football tab
    Then get the Team name of first live match
    And  place the bet for first team
    Then verify the team name and betting price in Bet slip
    Examples:
      | userName | password   |
      | Sushant  | Sushant123 |
