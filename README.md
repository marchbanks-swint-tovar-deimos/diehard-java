#Andrew's Exercises

1. Make a new package called bookstore. Inside it:
   
   make a Person superclass w/ name property, set name w/ constructor
   Make a Customer subclass that inherits from person
   Make an Author subclass that inherits from person, add a counter for the number of books written
   Create a Product class w/ title and price and constructor that sets those properties
   Create a Book class that inherits from product and ads an author property
   Book class’s author property should hold an Author typed object
   Make a class called BookStore.java that has your main method and the code that runs.
   Make 3 authors
   Make 5 books
   Create 8 customers, store them in an array, have each customer buy a book or two
   
2. Sort through an array of both positive and negative numbers and return the largest number.    
    example: [1,2,3,4,5,-20,16]
    return: 16

3. Take in a string and return the string in reverse order.
    example: "hello"
    return: "olleh" 

#Colin's Exercises

1. Odd One Out

   Write a function that returns true if exactly one word in the array differs in length from the rest. Return false in all other cases.
   
   Examples
   oddOneOut(["silly", "mom", "let", "the"]) ➞ true
   
   oddOneOut(["swanky", "rhino", "moment"]) ➞ true
   
   oddOneOut(["the", "them", "theme"]) ➞ false
   
   oddOneOut(["very", "to", "an", "some"]) ➞ false
   Notes
   The length of the array will always have at least three or more words.
  
2. Roman Numeral Converter

   Create a function that takes an Arabic number and converts it into a Roman number.
   
   Examples
   convertToRoman(2) ➞ "II"
   
   convertToRoman(12) ➞ "XII"
   
   convertToRoman(16) ➞ "XVI"
   Notes
   All roman numerals should be returned as uppercase.
   The largest number that can be represented in this notation is 3,999. 
   
3. Kaprekar's Constant

   6174 is known as one of Kaprekar's constants, after the Indian mathematician D. R. Kaprekar. Number 6174 is notable for the following rule:
   
   Take any four-digit number, using at least two different digits (leading zeros are allowed).
   Arrange the digits in descending and then in ascending order to get two four-digit numbers, adding leading zeros if necessary.
   Subtract the smaller number from the bigger number.
   Go back to step 2 and repeat.
   The above process, known as Kaprekar's routine, will always reach its fixed point, 6174, in at most 7 iterations. Once 6174 is reached, the process will continue yielding 7641 – 1467 = 6174. For example, choose 3524:
   
   5432 – 2345 = 3087
   8730 – 0378 = 8352
   8532 – 2358 = 6174
   7641 – 1467 = 6174
   Write a recursive function that will return the number of times it will take to get from a number to 6174 (the above example would equal 3).
   
   (1)5432 – 2345 = 3087,
   (2)8730 – 0378 = 8352,
   (3)8532 – 2358 = 6174
   495 would produce the following: 4950 to 9540 - 459, 9081 to 9810 - 189, 9621 to 9621 - 1269, 8352 to 8532 - 2358 answer: 4
   
   For a 2 digit number, the following would be produced (stating with number 10 -> 100):
   
   100 to 100 - 1, 990 to 990 - 99, 8910 to 9810 - 189, 9621 to 9621 - 1269, 8352 to 8532 - 2358 answer: 5
   
   Examples
   kaprekar(6621) ➞ 5
   
   kaprekar(6554) ➞ 4
   
   kaprekar(1234) ➞ 3
   Notes
   If the subtracted number is less than 1000, add an extra zero to that number. The number 1111 will equal 0000, so this number (1111) is invalid. If you're still unclear, please check the comments section.

#Lauren's Exercises
1. Rock paper scissors

    *Have a user input rock/paper/scissors and have them play against the computer
    
    *Display the result of the game
    
    *Continue playing the game if the user chooses to
    
2.  User bank account

    *A user account that can withdrawal and deposit money 
    
    *If the amount they withdraw exceeds the balance throw a error

3. Garment Barn Invoice

     *A store that will show a completed invoice 
         
     *The total quantity ordered 
          
     *The total the whole invoice is
           
     *If the quantity is zero then it should not be added to the invoices total/totalqty
        
    
