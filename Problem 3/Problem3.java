import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int tableSize=10, guests, tablesFilled;
        /* Type your code here. */
        guests = scnr.nextInt();

        tablesFilled = guests/tableSize;

        System.out.println("Tables filled: " + tablesFilled);
    }
}