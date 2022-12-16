# selenium_timesheet


The outcomes of Main Project deliverables are: 
•	Collaborate and deliver as a Team
•	Align to the BU real business problem
•	Build automation test suite.
•	Implement the Hybrid automation frameworks (Prototype) with all mandatory features.
•	Automating good coverage of Regression Test Cases.


CONTENTS OF THIS FILE 

•	Introduction 
•	Pre-requisites 
•	Tools Used 
•	Procedure for accessing 


Introduction: 
Timesheet is one of the application in one cognizant portal. Here we can update our week wise working hours. We have to update it on every week Friday. Inside timesheet it contains three division. In first division they are asking about our project ID, project name, Task/activity ID, Onsite/offshore, Billing action and Billing location. We need to fill all the details accordingly. After that we need to provide the hours that we had worked (From Saturday to Friday)
Mostly second division is auto updated division. In second division, the hours that we entered in TruTime will be auto updated to the respective dates.
In third division, we can update the hours for the day we took leave otherwise it will be automatically updated if any holidays. After filling all the details we can give update totals it will sum up all the hours we entered in the first division. Then we have to click submit with confirmation. Once we clicked ok, it will be submitted for approval.

Pre-requisites: 
The Be.cognizant website which contains the Timesheet automation should be opened by the authenticated user.  
 
 
URL for Mainspring: “https://be.cognizant.com/”

Frameworks & Tools Used: 

•	Selenium Web Driver (Version 4.1.0) 
•	Maven  
•	TestNG (Version 6.9.10) 
•	Extent Reports API (Version 4.0.9) 
•	Apache POI (Version 5.1.0) 
•	TestNG Reports 
•	Page Object Model


Procedure for accessing: 

1.Launch Be.Cognizant website.
2.Get the current user name and print it in the console.
3.In start searching text box type Timesheet and click search icon.
4.click ESA Timesheet option among the listed results.
5.The timesheet page is opened, then we need to retrieve the date of previous Saturday and the next Friday and check it with the first row in the timesheet. This steps will be carried out for 2nd row and 3rd row.


Conclusion: 

The results of all the test cases will be displayed in the console. The Extent report of the project will be generated once the automation gets completed. All the screenshots will be available in the “Screenshot” folder. 

