import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;

    // Constructor
    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Method to display employee details
    void displayEmployee() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[2];

        // Input details for two employees
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details of Employee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            emp[i] = new Employee(id, name, salary);
            System.out.println();
        }

        // Display employee details
        System.out.println("Employee Details:");
        for (int i = 0; i < 2; i++) {
            emp[i].displayEmployee();
        }

        sc.close();
    }
}
