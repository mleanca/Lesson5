public class Lesson5Ex2Of3 {
    public static void main(String[] args) {

        for (int i = 100; i <= 1000; i++) {

            if (i % 5 == 0 && i % 6 == 0)
                System.out.print(i + " ");

            if (i % 10 == 0)
                System.out.println();
        }
    }
}
