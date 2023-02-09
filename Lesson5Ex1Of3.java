import java.util.Scanner;
public class Lesson5Ex1Of3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //object input

        int positive = 0;
        int negative = 0;
        int sum = 0;
        int count = 0;

        System.out.println("Enter a number: ");
        int numberEntered = 8;

        //while ((numberEntered = input.nextInt()) != 0) {
        //number entered is equal to random input, method nextInt() from Scanner class is used to get the next random integer value from this random number generator's sequence.
        //and not equal to zero

        while ((numberEntered = input.nextInt()) != 0) {
            sum += numberEntered;
            count++;

            if (numberEntered > 0) {
                positive++;
            } else if (numberEntered < 0) {
                negative++;
            }
        }

        System.out.println("Positive values = " + positive);
        System.out.println("Negative values = " + negative);
        System.out.println("Sum of values = " + sum);
    }
}