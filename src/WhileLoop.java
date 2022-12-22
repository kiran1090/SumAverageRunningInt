
 int sum = 0;
      int number = LOWERBOUND;        // declare and init loop index variable
      while (number <= UPPERBOUND) {  // test
         sum += number;
         ++number;                    // update
      }
Modify the program to use a "do-while" loop.
      int sum = 0;
      int number = LOWERBOUND;         // declare and init loop index variable
      do {
         sum += number;
         ++number;                     // update
      } while (number <= UPPERBOUND);  // test
What is the difference between "for" and "while-do" loops? What is the difference between "while-do" and "do-while" loops?
Modify the program to sum from 111 to 8899, and compute the average. Introduce an int variable called count to count the numbers in the specified range (to be used in computing the average).
      int count = 0;   // Count the number within the range, init to 0
      for ( ...; ...; ... ) {
         ......
         ++count;
      }
