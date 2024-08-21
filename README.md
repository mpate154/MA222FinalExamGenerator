# MA222FinalExamGenerator
**Made Spring 2024 - exams not updated since

Using my file reading skills and data structures skills, I created a Final Exam Generator to help me study for my probability exam. Because past exams were given, this code picks random questions from past tests and creates an exam. Check out this cool self-project (Yes, I was doing this to procrastinate studying as well, but it paid off)! 

Given the past exams for the three exams given throughout the semester, I made 3 text files with all the exams from each test (ex. all exam 1's were in a text file). I tried to use a converter but because of the different formats (some docx, some scanned jpegs, and some pdf), it was easier to copy and paste each exam manually. 

I took three questions from each exam of three to create a new exam. It doesn't look exactly like the Professor's exams in terms of format because it's just a printed version of each question, so if you do generate more than 1 exam, you may want to skip to the next line in between them. If not, the numbers will give away when the next exam starts. Enjoy and I welcome critiques! 

## Table of Contents
- [Get this generator](#two-ways-to-use-this-generator)
- [Usage](#usage)
- [What I learned](#what-i-learned)
- [Future additions](#future-additions)

  
## Two ways to use this generator 
### 1. Clone this repository 
Copy and paste this into your command line

```git clone https://github.com/mpate154/MA222FinalExamGenerator.git```

OR
### 2. Download (or copy and paste if you prefer, but it takes longer) the raw code from the 'src' file, and all of the 'exam' text files, and open it up on your IDE

**For both, code comments explain what each line does** 

## Usage
If the last semester's exams have been added to the Canvas page
1. Copy and paste those tests into the appropriate test text files (These files contain up to the 2024 tests) 
2. Run the 'main' file to generate an exam!
3. Copy and paste the second line multiple times if you want multiple exams to be generated.

## What I learned
- Applied file-reading skills, catching errors and exceptions, importing libraries, and data structures learned in CS 284 (Data Structures) in Java
- At first my code ran for too long because I used an Array to check for the beginning numbers of questions so I used HashMap to easily search for and identify them instead.
- Done on IntelliJ Idea
  
## Future additions
- Use keys and hashsets to make sure questions added are unique and not repeats.
- More efficient runtime. There are a lot of loops that I think can be more efficient.
  
***Feel free to critique on time-space complexity and efficiency and/or code cleaniness. I appreicate helpful advice!***
