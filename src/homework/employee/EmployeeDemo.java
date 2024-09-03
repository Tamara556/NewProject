package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    private static final String EXIT = "0";
    private static final String ADD_EMPLOYEE = "1";
    private static final String PRINT_ALL_EMPLOYEES = "2";
    private static final String SEARCH_EMPLOYEE_BY_ID = "3";
    private static final String SEARCH_EMPLOYEE_BY_COMPANY = "4";

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    searchEmployeeById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY:
                    searchEmployeeByCompany();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }

    }

    private static void searchEmployeeByCompany() {
        System.out.println("Please input company name");
        String company = scanner.nextLine();
        employeeStorage.searchEmployeeByCompany(company);
    }

    private static void searchEmployeeById() {
        System.out.println("Please input employee ID");
        String employeeID = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeID);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee with ID " + employeeID + " not found.");
        }
    }

    private static void addEmployee() {
        System.out.println("Please input employee name");
        String name = scanner.nextLine();
        System.out.println("Please input employee surname");
        String surname = scanner.nextLine();
        System.out.println("Please input employee ID");
        String employeeID = scanner.nextLine();
        System.out.println("Please input employee salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input company name");
        String company = scanner.nextLine();
        System.out.println("Please input employee position");
        String position = scanner.nextLine();

        Employee employee = new Employee(name, surname, employeeID, salary, company, position);
        Employee existingEmployee = employeeStorage.getEmployeeById(employeeID);
        if (existingEmployee == null) {
            employeeStorage.add(employee);
            System.out.println("Employee added!");
        } else {
            System.out.println("Employee with ID " + employeeID + " already exists!");
        }
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_EMPLOYEE + " for ADD_EMPLOYEE");
        System.out.println("Please input " + PRINT_ALL_EMPLOYEES + " for PRINT_ALL_EMPLOYEES");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_ID + " for SEARCH_EMPLOYEE_BY_ID");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY + " for SEARCH_EMPLOYEE_BY_COMPANY");
    }
}
