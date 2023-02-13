public class Lesson5Ex3Of3 {
    public static void main(String[] args) {

        double sum = 0.0; //to initialize sum variable

        for (double i = 1.0; i <= 97.0; i += 2) {
            //1st condition, i begins at 1
            //2nd condition, i must be less than or equal to 97
            //increment byt 2
            sum += (i / (i + 2));
            //sum = sum + (i / (i + 2))
            //1st it sum = 0 + (1 / (1 + 2)) = 1/3
            //2nd it sum = 0 + (3 / (3 + 2)) = 3/5, sum doesn't increment with each iteration only i
            //.. n it sum = 0 + (97 / (97 + 2)) = 97/99
        }
        System.out.println("Sum is " + sum);
    }
}