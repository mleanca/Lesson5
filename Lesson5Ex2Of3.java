public class Lesson5Ex2Of3 {
    public static void main(String[] args) {

        for (int i = 100; i <= 1000; i++) {
            //1st condition, begins at 100
            //2nd condition, values must be less than or equal 1000
            //increment by 1 unit, i = i + 1

            if (i % 5 == 0 && i % 6 == 0)
                System.out.print(i + " ");
            // 100 % 5 == 0 && 100 % 6 == 0
            // 100 % 5 is 0 because it divides evenly
            // 100 % 6 is 4
            // 0 == 0 && 4 == 0, it is false
            //every increment will be false until a number it is divisible by 5 and 6

            if (i % 10 == 0)
                System.out.println();
            // (100 % 10 == 0)
            // outputs as space
        }
    }
}
