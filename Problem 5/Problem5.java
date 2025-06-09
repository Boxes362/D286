import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        int hunds = scnr.nextInt();
        int tens = scnr.nextInt();
        int ones = scnr.nextInt();

        int sum = hunds + tens + ones;
        int num = (hunds *100) + (tens * 10) + ones;

        if (hunds < 0 || tens < 0 || ones < 0)
        {
            System.out.println("Invalid input!");
        }
        else
        {
            if (sum % 3 == 0)
            {
                System.out.println(num + " is divisible by 3!");
            }
            else
            {
                System.out.println(num + " is not divisible by 3!");
            }
        }
    }
}