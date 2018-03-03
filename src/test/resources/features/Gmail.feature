Feature: Login Scenario to Gmail

    @smoke
    Scenario: Gmail Login
      Given I enter URL
      And I enter username ""
      And I click on Next button
      And I see the Welcome Page
      And I enter password ""
      And I click on Next button
      And I see the Inbox Page

