public class WhileL {

    public static void main(String[] args)
    {
        double sum = 0;
        double average;
        int LOWERBOUND = 1;
        int UPPERBOUND = 100;




        int number = LOWERBOUND;        // declare and init loop index variable
        while (number <= UPPERBOUND) {  // test
            sum += number;
            ++number;                    // update
        }

        average = sum/UPPERBOUND;
        System.out.println("The sum is " +sum);
        System.out.println("The average is " + average);
    }
}
