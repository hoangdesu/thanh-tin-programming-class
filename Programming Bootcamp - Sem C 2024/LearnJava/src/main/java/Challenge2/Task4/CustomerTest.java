package Challenge2.Task4;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args){
        /**
         * Sample code has been provided as as starting point to test your implementation.
         *
         * IMPORTANT: This code will not compile until you write the classes and enum being used here.
         * You must write the class with the documented method signatures before you can use the test code
         * below.
         * You may modify this code for faster testing purposes and exploration, but your assessment is
         * evaluated through the use of unit tests, so you need to ensure that the classes/enum you write
         * comply with the requirements setout in the documentation.
         *
         * Adding undocumented methods to your classes will mean that
         * the unit tests may fail.
         */

        // UNCOMMENT THE CODE BELOW ONCE YOU HAVE WRITTEN YOUR CODE TO TEST YOUR IMPLEMENTATION
          final String ERROR_STR = "ERROR";
          final int ERROR_NUM = -1;

          Customer customer1 = new Customer("John Doe", 123456789, "john.doe@example.com", Privilege.GOLD);
          Customer customer2 = new Customer("Alice Smith", 98765432, "alice.smith@example.com", Privilege.SILVER);
          Customer customer3 = new Customer("Bob Johnson", 87654321, "bob.johnson@example.vn", Privilege.DIAMOND);
          Customer customer4 = new Customer("emma brown", 234567, "emma.brown@example.com", Privilege.GUEST); // Invalid customerId
          Customer customer5 = new Customer("Michael Nguyen", 34567890, "michael.nguyen@example.vn", null);
          Customer customer6 = new Customer("sarah lee", 45678901, "sarah.lee@example.com", Privilege.GOLD); // Lowercase name
          Customer customer7 = new Customer("David Wilson", 12, "david.wilson@example.vn", Privilege.SILVER);
          Customer customer8 = new Customer("sophia martinez", 67890123, "sophia.martinezexample.com", Privilege.GUEST); // Invalid email
          Customer customer9 = new Customer("Chris Taylor", 78901234, "chris.taylor@example.vn");
          Customer customer10 = new Customer("lily ad2ams", 89012345, "lily.adams@example.de", Privilege.GUEST); // Lowercase name
          Customer customer11 = new Customer("l", 89012345, "lily.adams@example.de", Privilege.GUEST); // Lowercase name
          Customer customer12 = new Customer("thanh tin ", 89012345, "lily@example.de", Privilege.GUEST); // Lowercase name

          ArrayList<Customer> customers = new ArrayList<>();
          customers.add(customer1);
          customers.add(customer2);
          customers.add(customer3);
          customers.add(customer4);
          customers.add(customer5);
          customers.add(customer6);
          customers.add(customer7);
          customers.add(customer8);
          customers.add(customer9);
          customers.add(customer10);

          System.out.println("Customer 1 name is valid? " + !customer1.getName().equals(ERROR_STR));
          System.out.println("Customer 6 name is ERROR? " + customer6.getName().equals(ERROR_STR));
          System.out.println("Customer 8 name is ERROR? " + customer8.getName().equals(ERROR_STR));
          System.out.println("Customer 10 name is ERROR? " + customer10.getName().equals(ERROR_STR));

          System.out.println("-----------");
          System.out.println("Customer 9 ID is valid? " + (customer9.getCustomerId() != ERROR_NUM));
          System.out.println("Customer 7 ID is valid? " + (customer7.getCustomerId() != ERROR_NUM));
          System.out.println("Customer 4 ID is invalid? " + (customer4.getCustomerId() == ERROR_NUM));

          System.out.println("-----------");
          System.out.println("Customer 2 Email is valid? " + (!customer2.getEmail().equals(ERROR_STR)));
          System.out.println("Customer 8 Email is invalid? " + (customer8.getEmail().equals(ERROR_STR)));
          System.out.println("Customer 10 Email is valid? " + (!customer10.getEmail().equals(ERROR_STR)));

        //  System.out.println("-----------");
        //  System.out.println("Customer 5 Privilege is set to GUEST? " + (customer5.getPrivilege() == Privilege.GUEST));
        //  customer3.setPrivilege(Privilege.GOLD);
        //  System.out.println("Customer 3 Privilege is set to GOLD? " + (customer3.getPrivilege() == Privilege.GOLD));

        //  // Printing each customer using toString()
        //  System.out.println("-----------");
        //  for (Customer customer : customers) {
        //       System.out.println(customer.toString());
        //       System.out.println("-----------");
        //  }
    }

}
