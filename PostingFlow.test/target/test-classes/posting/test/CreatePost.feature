@Posting @P1
Feature: Posting Flow in Sminq Mobile App
As a user
I should be able to click photos and post them with moods
So that I can publish my posts on my timeline

@BVT @TestCase-14 @Regression
Scenario Outline: Create a new Post
Given the Sminq Mobile App is opened on "local"
When I allow "Notification" access
And I login with Google
And I allow "Google Sign In" access
And I enter "<GMAIL>" as username and "<Password>" as password
And I allow "Sminq Location" access
And I allow "iOS Location" access
Then the home page is displayed
When I click on the camera icon to create a post
And I allow "Sminq Camera" access
And I allow "iOS Camera" access
And I allow "Sminq Microphone" access
And I allow "iOS Microphone" access
And I click a photograph
And I select the first location as "My_Location"
And I select mood icon "<Mood>"
And I click on "DONE"
And I click on "POST"
Then the post should be added to the home page
And the location of the post should be "My_Location"
And the mood of the post should be "<Mood>"

Examples:
| GMAIL | Password | Mood |
| saviant.sminq | Sminq@123 | MEH |
