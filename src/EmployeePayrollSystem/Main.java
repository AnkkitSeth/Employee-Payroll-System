package EmployeePayrollSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        Scanner sc=new Scanner(System.in);
        String name;
        int id;
        boolean check=true;
        while(check){
            System.out.println("Payroll System Menu:");
            System.out.println("1. Add Full-Time EmployeePayroll.Employee");
            System.out.println("2. Add Part-Time EmployeePayroll.Employee");
            System.out.println("3. Remove EmployeePayroll.Employee");
            System.out.println("4. Display Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("\nEnter details for Full Time EmployeePayroll.Employee:- ");
                    System.out.println("Enter EmployeePayroll.Employee Name: ");
                    name = sc.nextLine();
                    System.out.println("Enter EmployeePayroll.Employee id: ");
                    id = sc.nextInt();
                    System.out.println("Enter EmployeePayroll.Employee Monthly Salary: ");
                    double salary = sc.nextDouble();
                    payrollSystem.addEmployee(new FullTimeEmployee(name, id, salary));
                    System.out.println("\nFull Time EmployeePayroll.Employee added successfully!");
                    break;

                case 2:
                    System.out.println("\nEnter details for Part Time EmployeePayroll.Employee:- ");
                    System.out.println("Enter EmployeePayroll.Employee Name: ");
                    name = sc.nextLine();
                    System.out.println("Enter EmployeePayroll.Employee id: ");
                    id = sc.nextInt();
                    System.out.println("Enter Hours Worked: ");
                    int hours = sc.nextInt();
                    System.out.println("Enter Hourly Rate: ");
                    double rate = sc.nextDouble();
                    payrollSystem.addEmployee(new PartTimeEmployee(name, id, hours, rate));
                    System.out.println("\nPart Time EmployeePayroll.Employee added successfully!");
                    break;

                case 3:
                    System.out.print("Enter EmployeePayroll.Employee ID to Remove: ");
                    int idToRemove = sc.nextInt();
                    payrollSystem.removeEmployee(idToRemove);
                    System.out.println("EmployeePayroll.Employee Removed Successfully (if ID exists).");
                    break;

                case 4:
                    System.out.println("EmployeePayroll.Employee Details:");
                    payrollSystem.displayEmployees();
                    break;

                case 5:
                    System.out.println("Exiting Payroll System. Goodbye!");
                    check=false;
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");

            }
        }
    }
}