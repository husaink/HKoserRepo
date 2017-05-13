Feature: Google Search

	Scenario: Search cucumber keyword using Google
		Given User is on google home page
		When User search "cucumber" keyword
		And   Clicks Google Search
		Then User is displayed searched results