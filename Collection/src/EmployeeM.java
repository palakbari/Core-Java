import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int emp_id;
    private String emp_name;
    private double emp_salary;

    public Employee() {
        // Default constructor
    }

    public Employee(int id, String name, double salary) {
        this.emp_id = id;
        this.emp_name = name;
        this.emp_salary = salary;
    }

    // Getters and setters
    public int getId() {
        return emp_id;
    }

    public void setId(int id) {
        this.emp_id = id;
    }

    public String getName() {
        return emp_name;
    }

    public void setName(String name) {
        this.emp_name = name;
    }

    public double getSalary() {
        return emp_salary;
    }

    public void setSalary(double salary) {
        this.emp_salary = salary;
    }
}

public class EmployeeM {
    public static void main(String[] args) {
        ArrayList<Employee> employees= new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee Details");
            System.out.println("3. Display Record");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter employee name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter employee salary: ");
                    double salary = sc.nextDouble();
                    Employee emp = new Employee(id, name, salary);
                    employees.add(emp);
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    System.out.print("Enter employee ID to update: ");
                    int empId = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    boolean found = false;
                    for (Employee e1 : employees) {
                        if (e1.getId() == empId) {
                            found = true;
                            System.out.print("Enter new employee name: ");
                            String newName = sc.nextLine();
                            e1.setName(newName);
                            System.out.print("Enter new employee salary: ");
                            double newSalary = sc.nextDouble();
                            e1.setSalary(newSalary);
                            System.out.println("Employee information updated successfully.");
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found with ID: " + empId);
                    }
                    break;
                case 3:
                    System.out.println("Employee Records:");
                    for (Employee empRec : employees) {
                        System.out.println("ID: " + empRec.getId() + ", Name: " + empRec.getName() + ", Salary: " + empRec.getSalary());
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }
}
