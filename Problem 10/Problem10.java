import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        // TODO: Declare name and age variables (string, and int)
        String name1;
        String name2;
        int age1;
        int age2;

        // TODO: Read name and age input for customer 1
        name1 = scnr.nextLine();
        age1 = scnr.nextInt();
        scnr.nextLine();

        // TODO: Set customer 1 name and age fields using mutator methods (setName() and setAge())
        customer1.setName(name1);
        customer1.setAge(age1);

        // TODO: Read name and age input for customer 2
        name2 = scnr.nextLine();
        age2 = scnr.nextInt();

        // TODO: Set customer 2 name and age fields using mutator methods (setName() and setAge())
        customer2.setName(name2);
        customer2.setAge(age2);

        System.out.println("Customer that is older:");

        /// TODO: Determine older customer (use getAge())
        //       and output older customer's info (use printInfo())
        if (customer1.getAge() > customer2.getAge())
        {
            customer1.printinfo();
        }
        else
        {
            customer2.printInfo();
        }
    }
}