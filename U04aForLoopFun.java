import java.util.Scanner;

public class U04aForLoopFun {

    // Write four static methods that contain for loops.
    // Each method should be designed to handle the parameters specified and return the calculated result.
    // You MUST use a for loop in each static method.

    // 1. sumEvensExclusive(int a) - Must use a for loop. Returns the sum of all even integers between 2 and a (exclusive of a). 
    // Example: sumEvensExclusive(10) returns 14 (4 + 6 + 8).
    public static int sumEvensExclusive(int a){
        int result = 0;
        for(int i = 4; i < a; i += 2){
            result += i;
        }
        return result;
    }

    // 2. int sumSquaresExclusive(int a) - Must use a for loop. Returns the sum of all perfect squares between 1 and a (exclusive of a).
    // Example: sumSquaresExclusive(20) returns 13 (4 + 9). Note: You must include 1 in the sum, because it is a perfect square.
    public static int sumSquaresExclusive(int a){
        int result = 0;
        for(int i = 1; Math.pow(i, 2) < a; i++){
            result += Math.pow(i, 2);
        }
        return result;
    }

    // 3. int sumOddsInRangeExclusive(int a, int b) - Must use a for loop. Returns the sum of all odd integers between a and b (exclusive of b).
    // Example: sumOddsInRangeExclusive(10, 16) returns 39 (11 + 13 + 15). Note: If b is odd, it must not be included in the sum.
    public static int sumOddsInRangeExclusive(int a, int b){
        int result = 0;
        for(int i = a; i < b; i++){
            if(i % 2 != 0){
                result += i;
            }
        }
        return result;
    }

    // 4. int sumOddFourDigits(int a) - MUST use a for loop.
    // You are guaranteed that the parameter will be a four-digit number, so create a for loop that repeats 4 times.
    // Analyzes the individual digits of the integer a and returns the sum of only the digits that are odd.
    // Example: sumOddDigits(1635) returns 9 (1 + 3 + 5). PRECONDITION: int a will always be a 4-digit number.
    public static int sumOddFourDigits(int a){
        int result = 0;
        int number = Math.abs(a);
        for(int i = 0; i < 4; i++){
            int digit = number % 10;
            if(digit % 2 != 0){
                result += digit;
            }
            number = number / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- First Input Section ---
        System.out.print("Gimme a positive integer: ");
        int a = input.nextInt();

        // Calling the first two methods and the digit method
        int evenSum = sumEvensExclusive(a);
        int squareSum = sumSquaresExclusive(a);

        System.out.println("The sum of all even numbers between 2 and " + a + " (exclusive) = " + evenSum);
        System.out.println("The sum of all squares between 1 and " + a + " (exclusive) = " + squareSum);

        // --- Second Input Section ---
        System.out.print("Gimme a positive integer larger than " + a + ": ");
        int b = input.nextInt();

        // Calling the range method
        int rangeSum = sumOddsInRangeExclusive(a, b);

        System.out.println("The sum of all odd numbers between " + a + " and " + b + " (exclusive) = " + rangeSum);

        // --- Third Input Section ---
        System.out.print("Gimme a 4-digit number: ");
        int c = input.nextInt();
        int digitSum = sumOddFourDigits(c);

        System.out.println("The sum of all odd digits of " + c + " = " + digitSum);

        input.close();
    }
}
