public class CountUsingcount {

        public static void main(String[] args)
        {
            double sum = 0;
            double average;
            int lowerbound = 111;
            int upperbound = 8899;



            for(int number = lowerbound; number <= upperbound; number++) {
                sum += number;
            }

            average = sum/upperbound;
            int count = 0;   // Count the number within the range, init to 0
            for ( count=lowerbound;count<=upperbound; count++ ) {

                ++count;
            }
            System.out.println("The sum is " +sum);
            System.out.println("The average is " + average);
            System.out.println("The count is " + count);
        }
    }


