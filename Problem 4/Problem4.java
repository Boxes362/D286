import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        String name = scnr.nextLine();
        int age = scnr.nextInt();
        String salary = scnr.next();

        System.out.println(name + " is " + age + " and makes $" + salary + ".");
    }
}