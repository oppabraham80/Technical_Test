


@tag
Feature:  LexisNexis Risk Decision Making Verification

  Scenario: Verify presence and clickability of elements on LexisNexis homepage
  Given I am on the LexisNexis homepage
  Then Financial Services should be present and clickable
  And Insurance should be present and clickable
  And Life and Pensions should be present and clickable
  And Corporations and Non-Profits should be present and clickable
  When I select Financial Services under Choose your Industry tab
  Then Financial Crime Compliance should be present and clickable
  And Fraud and Identity Management should be present and clickable
  And Customer Data Management should be present and clickable
  And Credit Risk Assessment should be present and clickable
  And Collections & Recovery should be present and clickable
  And Tracing and Investigations should be present and clickable
  
  

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

   Examples:
    | name                | value         | status    |
    | Financial Services | present       | clickable |
    | Insurance           | present       | clickable |
    | Life and Pensions  | present       | clickable |
    | Corporations and Non-Profits | present | clickable |
