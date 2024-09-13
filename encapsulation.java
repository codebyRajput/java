class Employee {
    private double salary;
    private String department;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Please provide a non-negative value.");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(50000.0);
        employee.setDepartment("IT");

        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Department: " + employee.getDepartment());
    }
}
