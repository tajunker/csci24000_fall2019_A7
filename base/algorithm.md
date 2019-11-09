# Goals: 
The purpose of this lab is to give you a deeper understanding of memory management by forcing you to utilize the standard C++ heap structure as much as possible.

Build a normalized student record system. Create a class to represent student data. You will also create classes to handle other specific types of data including dates and addresses. Your system will include all the necessary header files, cpp files, Makefile, and a main program to incorporate the larger system.

# Input: 
Load up student data from a text file. All the needed information for the students should be in a text file, with each student's information on one line. We will provide you with a file with student data. There will be 50 students.  The file is available under:  students.dat

# Output: 
- Store student data on the heap Student data will be a large array, so it should be stored on the heap. Ensure you've also removed heap data when necessary.
- List all data for all students in a report format Create a method of the Student class to print a report about every student into a separate text file called "fullReport.txt".
- Create a simpler list that prints only the last and first name of each student into a separate text file called "shortReport.txt".
- Output a list of student names in alphabetical order Print the list in alphabetical order  into a separate text file called "alphaReport.txt". You can use your own sort algorithm, or the one from std::sort for this.

# Steps: 
For this program we have one main function called main(). In our blackbelt assignment there are two extra functions to accomplish the necessary edge case checks.

- main(): This program has a main function in main.cpp
- sortStudents(): This program has a sortStudents function which sorts the students in alphabetical order.
- swapStudents(): This program has a swapStudents function which is used by sortStudents() to swap the values as necessary to perfrom the alphabetical ordering of the Students. 
- This program also has an Address class, Date class, Student class, and their respective header files, in order to accomplish the read/write funcitonality necessary to write the appropriate output text files.
- In main(), the getline function is used to manipulate large pieces of data into progressively smaller chunks. 
- Together with the stringstream function, we can collect a large line of input and control where each piece goes. 
- In this main functin we read from a text file called student.dat. 
- We check to verify that the file is exists and proceed with reading from the text file. 
- In a for loop, we parse each new line of strings into an array of Students and save them to variables using the getline function.
- We then output/write the saved information to shortReport.txt, which contains just the last name and first name of all students.
- We then output/write the saved information to alphaReport.txt, which contains just the last name and first name of all students in alphabetical order.
- We then output/write the saved information to fullReport.txt, which contains all student information.
- Finally we close all text files
- All of this can be compiled with the makefile provided, which also contains a valgrind command to check for memory leakeage and other useful commands.
