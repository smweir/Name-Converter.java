This Java program takes user input of a full name and formats it into a last-name-first format with initials for the first and middle names, if provided.

Features:
Accepts a full name input consisting of a first name and an optional middle name followed by a last name.
Outputs the last name first, followed by the initials of the first and middle names.

How It Works:
User Input:
The program prompts the user to enter their full name.
It reads the input and splits it into an array based on spaces.

Name Processing:
If the input contains exactly two parts (first and last names):
The program extracts the first initial from the first name and prints the last name followed by the initial.
If the input contains exactly three parts (first, middle, and last names):
It extracts the initials from both the first and middle names and formats the output similarly.
