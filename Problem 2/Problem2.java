import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        int starting_num = scnr.nextInt();
        int multiplier = scnr.nextInt();

        int result1 = starting_num * multiplier;
        int result2 = result1 * multiplier;
        int result3 = result2 * multiplier;

        System.out.println(result1 + " " + result2 + " " + result3);
    }
}