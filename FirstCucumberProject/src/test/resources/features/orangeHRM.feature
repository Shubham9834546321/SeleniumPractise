Feature: Test PIM functionality of Orange HRM application
Background: 
Given user are already in orange HRM login page
And login with using a valid username as "Admin" and password "admin123"
And from the dashboard page click on Pim link
Scenario: verify pim creation
When user click on add button
And enter firstName as "shubh_9689",lastName as "Thool", click on save button
And  click on pim link
And search created employee as "shubh_9689"
Then verify newly created employee search sucessfully
Scenario: Verify pim edit
When search created employee as "shubh_9689"
And user select the checkbox and click on edit button
And enter midle name as a "deepak",click on save button
Then Verify employee sucessfully updated
Scenario: Verify pim delete
When click on pim and search id as a "shubh_9689"
And user select the checkbox and click on edit button
And user click on delete button
And again click on popup detele button

