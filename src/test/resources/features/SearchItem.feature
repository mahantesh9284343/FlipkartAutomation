Feature: Search functionality

Scenario: Search and select product
Given User open browser and navigate to url
When User close login tab
When User search for product as "Dell"
Then User validate search is successful for "Dell"
Then User select the Product
Then User add product to cart


