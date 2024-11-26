# Java Console App Documentation: TODO Project

Project Description

The TODO App is a Java console-based application designed to help users manage their tasks. Users can create accounts, update their passwords, add tasks, and manage their statuses. This project will strengthen your understanding of core Java concepts, such as object-oriented programming (OOP), file handling, exception handling, and user input validation.

Project Requirements

1. Create an Account

   •	Inputs: Email and Password
   •	Validation:
   •	The email must be in a valid format.
   •	The password must have at least 8 characters, including one uppercase letter, one number, and one special character.
   •	Behavior: Store the account information securely (e.g., in a file or in-memory data structure).

2. Change Password

   •	Inputs: Old password, new password
   •	Validation:
   •	Check if the old password matches the one stored.
   •	Validate the new password using the same criteria as above.
   •	Behavior: Update the password for the user.

3. Add TODO Task

   •	Inputs: Task name, due date, priority (Low, Medium, High)
   •	Validation: Ensure inputs are not empty and that the due date is in the correct format (e.g., YYYY-MM-DD).
   •	Behavior: Add the task to the user’s TODO list and mark its status as “Pending.”

4. Update Task Status

   •	Inputs: Task ID, new status (e.g., Pending, In Progress, Completed)
   •	Validation: Ensure the task ID exists and the status input is valid.
   •	Behavior: Update the task status.

Additional Features (Optional but Encouraged)

5. Delete Task

   •	Inputs: Task ID
   •	Behavior: Remove a task from the TODO list.

6. List All Tasks

   •	Behavior: Display all tasks with their details (ID, name, due date, priority, status).

7. Search Tasks by Status or Priority

   •	Inputs: Status or Priority
   •	Behavior: Filter and display tasks based on the chosen criteria.

8. Sort Tasks

   •	Inputs: Sorting field (e.g., due date, priority)
   •	Behavior: Display tasks in sorted order.

Implementation Guidelines

1. Use Classes to Represent Entities

   •	Account Class: To manage user details (email, name, password).
   •	Task Class: To represent TODO tasks (ID, name, due date, priority, status).

2. Core Concepts

   •	File Handling: Use files (e.g., text or JSON) to save account and task data for persistence.
   •	Collections: Use ArrayList or HashMap to manage tasks in-memory.
   •	Validation and Exception Handling: Ensure robust input validation and error management.
   •	Menu-Driven Console: Provide an intuitive menu for users to navigate through the app.

Sample Console Output

    Welcome to TODO App!
    
       1. Create an Account
       2. Login
       3. Add TODO
       4. View TODOs
       5. Update Task Status
       6. Delete Task
       7. Logout
       8. Exit

Enter your choice:

Evaluation Criteria

	1.	Functionality: Does the app meet the project requirements?
	2.	Code Quality: Is the code clean, modular, and readable? Are OOP principles applied?
	3.	Error Handling: Are edge cases and invalid inputs managed gracefully?
	4.	Additional Features: Have you implemented any additional features?
	5.	Documentation: Is the code and project well-documented?

Extension Ideas (Optional)

	•	Implement a User Login System to allow multiple users to manage their own tasks.
	•	Add Task Reminders for tasks close to their due date.
	•	Provide Reports, such as completed tasks and pending tasks for the week.
	•	Integrate Priority Color Coding for tasks (e.g., High = Red, Medium = Yellow, Low = Green).

Submission

	•	Submit your code files with comments.
	•	Add a README file explaining how to run the app and its features.

Good Luck! Happy Coding!