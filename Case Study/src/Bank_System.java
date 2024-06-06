import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Customer {
    private String name;
    private int accountNumber;
    private double balance;

    public Customer(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() 
    {
        return name;
    }

    public int getAccountNumber() 
    {
        return accountNumber;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        balance += amount;
    }

    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
        } 
        else 
        {
            System.out.println("Insufficient balance!");
        }
    }

	public void setName(String newName) 
	{
		
	}
}

class Bank {
    private Map<Integer, Customer> customers;

    public Bank() 
    {
        customers = new HashMap<>();
    }

    public void addCustomer(String name, int accountNumber, double initialBalance) 
    {
        if (!customers.containsKey(accountNumber)) 
        {
            Customer newCustomer = new Customer(name, accountNumber, initialBalance);
            customers.put(accountNumber, newCustomer);
            System.out.println("New customer added successfully!");
        } 
        else 
        {
            System.out.println("Account number already exists!");
        }
    }

    public Customer authenticateCustomer(int accountNumber) 
    {
        return customers.get(accountNumber);
    }

    public void displayCustomerDetails(String customerName) 
    {
        boolean found = false;
        for (Customer customer : customers.values()) 
        {
            if (customer.getName().equals(customerName)) 
            {
                found = true;
                System.out.println("Name: " + customer.getName());
                System.out.println("Account Number: " + customer.getAccountNumber());
                System.out.println("Balance: $" + customer.getBalance());
                break;
            }
        }
        if (!found) 
        {
            System.out.println("Customer not found!");
        }
    }

    public void modifyCustomerDetails(int accountNumber, String newName) 
    {
        Customer customer = customers.get(accountNumber);
        if (customer != null) 
        {
            customer.setName(newName);
            System.out.println("Customer details modified successfully!");
        } 
        else 
        {
            System.out.println("Customer account not found!");
        }
    }

    public void deleteCustomer(int accountNumber) 
    {
        if (customers.containsKey(accountNumber)) 
        {
            customers.remove(accountNumber);
            System.out.println("Customer account deleted successfully!");
        } 
        else 
        {
            System.out.println("Customer account not found!");
        }
    }
}


public class Bank_System {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBank System Menu:");
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as Customer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    adminMenu(bank, scanner);
                    break;
                case 2:
                    customerMenu(bank, scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    public static void adminMenu(Bank bank, Scanner scanner) 
    {
        while (true) 
        {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Search Customer by Account Number");
            System.out.println("3. Search Customer by Name");
            System.out.println("4. Modify Customer Details");
            System.out.println("5. Delete Customer Account");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    bank.addCustomer(name, accountNumber, initialBalance);
                    break;
                case 2:
                	System.out.print("Enter account number: ");
                    int accountNumber1 = scanner.nextInt();
                    Customer customerByAccount = bank.authenticateCustomer(accountNumber1);
                    if (customerByAccount != null) {
                        System.out.println("Customer found:");
                        System.out.println("Name: " + customerByAccount.getName());
                        System.out.println("Account Number: " + customerByAccount.getAccountNumber());
                        System.out.println("Balance: $" + customerByAccount.getBalance());
                    } 
                    else 
                    {
                        System.out.println("Customer account not found!");
                    }
                    break;
                case 3:
                    scanner.nextLine(); 
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    bank.displayCustomerDetails(customerName);
                    break;
                case 4:
                    System.out.print("Enter account number to modify: ");
                    int accNumToModify = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    bank.modifyCustomerDetails(accNumToModify, newName);
                    break;
                case 5:
                    System.out.print("Enter account number to delete: ");
                    int accNumToDelete = scanner.nextInt();
                    bank.deleteCustomer(accNumToDelete);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }


    public static void customerMenu(Bank bank, Scanner scanner) 
    { 
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        Customer customer = bank.authenticateCustomer(accountNumber);

        if (customer != null) {
            while (true) {
                System.out.println("\nCustomer Menu:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. View Balance");
                System.out.println("4. Back to Main Menu");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        customer.deposit(depositAmount);
                        System.out.println("Deposit successful. Current balance: $" + customer.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        customer.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful. Current balance: $" + customer.getBalance());
                        break;
                    case 3:
                        System.out.println("Current balance: $" + customer.getBalance());
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid choice! Please enter a valid option.");
                }
            }
        } 
        else {
            System.out.println("Customer account not found!");
        }
    }

}
