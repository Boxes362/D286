import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        double numbers[] = new double [3];
        double a = numbers[0] = scnr.nextDouble();
        double b = numbers[1] = scnr.nextDouble();
        double c = numbers[2] = scnr.nextDouble();

        double sum = a + b + c;

        System.out.println("Array items: " + a + ", " + b + ", " + c);
        System.out.println("Average: " + (sum/3.0));
    }
}