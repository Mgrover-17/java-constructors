class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Updated Salary: " + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private String team;

    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Managing Team: " + team);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "IT", 60000);
        System.out.println("Employee Details:");
        emp1.displayEmployeeDetails();

        emp1.setSalary(65000);
        System.out.println("\nUpdated Employee Details:");
        emp1.displayEmployeeDetails();

        Manager obj = new Manager(201, "HR", 80000, "Recruitment");
        obj.displayManagerDetails();
    }
}
