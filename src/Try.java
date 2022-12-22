
 /*int sum = 0;
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
*/
Modify the program to find the "sum of the squares" of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.
Modify the program to produce two sums: sum of odd numbers and sum of even numbers from 1 to 100. Also computer their absolute difference.
HINTS:
      // Define variables
      int sumOdd  = 0;   // Accumulating sum of odd numbers
      int sumEven = 0;   // Accumulating sum of even numbers
      int absDiff;       // Absolute difference between the two sums
      ......
      // Compute sums
      for (int number = ...; ...; ...) {
         if (......) {
            sumOdd += number;
         } else {
            sumEven += number;
         }
      }
      // Compute Absolute Difference
      if (sumOdd > sumEven) {
         absDiff = ......;
      } else {
         absDiff = ......;
      }
      // OR use one liner conditional expression
      absDiff = (sumOdd > sumEven) ? ...... : ......;
