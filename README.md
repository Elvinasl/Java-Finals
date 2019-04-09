UML: https://www.lucidchart.com/invitations/accept/0cc07405-fc24-456c-a519-e5d6eb4926ee
Casus: Amusement Park “Java World!”

Amusement park Java World! has asked for a system that keeps track of their visitors. The system should let the visitors know what price they must pay to get into the park. 

For entering the park visitors must buy a ticket. These tickets vary in price based on the age and length of the visitors. The costs of a ticket for adults is € 25,-; for children younger than 7 the price is €15,-.The ticket for people under 1.35m is €10,-,  because they cannot use all of the attractions.  If people buy tickets for 5 or more persons, the cheapest one is free. An order can contain one or more tickets. 

Some of the attractions are only allowed for persons above 18 years old, due to the scary content. Some of them only for a length above 1.35 m., non-pregnant women, or people without a disability. 

The following attractions are available in the park:
Attraction	Min Age	Max Age	Min Length (in cm) 	Suitable for
				Pregnant Women	Disabled
SnakeByte	18	-	135	V	X
Casper the frINTly ghost
	-	12	-	N/A	V
Octabahn	6	12	-	N/A	X
JUnity	6	-	135	X	X
Floating point	16	-	-	X	V
River.isEmpty()	-	7	-	N/A	V


ASSIGNMENT 1 (40PT):
Implement the system as it is described above. Besides the necessary concrete classes, use at least one interface and at least one abstract class. Make use of the code that is already supplied!

Write a main class that uses the other classes in the system. 

Be aware: you are not allowed to use System.out.println statements in any other class than the main class.

ASSIGNMENT 2 (20PT):
Due to an accident at the Rafting Coarse “River.isEmpty()”, a buffer overflow, there is decided that there is a maintenance interval needed for the attractions. The system should return a list of attractions that need maintenance today, or at a certain date. 
The following intervals are specified: 
•	SnakeByte, every Monday;
•	Casper the frINTly ghost, no service needed;
•	Octabahn, every two days;
•	JUnity, every Friday;
•	Floating point, every three days;
•	River.isEmpty, every Saturday.

ASSIGNMENT 3 (20PT):
The management of the amusement park would like to see the revenue per month. 
and wants to see how many children there were in the park during a certain month. Make use of the empty functions that are already supplied.

ASSIGNMENT 4 (5PT):
Because of the number of pregnant women that visit the amusement park, a baby buggy producer wants to know the average length of the pregnant women that visit the park. Make use of the empty function that is already supplied. 

ASSIGNMENT 5 (5PT):
To make the amusement park more customer friendly, the amusement park wants to provide a list of suitable attractions when a visitor buys a ticket. Make use of the empty function that is already supplied.

ASSIGNMENT 6 (10PT):
Write a jUnit test class for assignment 4 and 5. 

