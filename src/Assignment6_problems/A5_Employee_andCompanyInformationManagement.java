package Assignment6_problems;

class EmployeeCompany {

    String empName;
    double salary;

    static String companyName =
            "Bright Horizon Technologies";

    static int employeeCount = 0;

    public EmployeeCompany(String empName,
                           double salary) {

        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {

        System.out.println(companyName);

        System.out.println(
                "Employees on record: "
                        + employeeCount);
    }
}

public class A5_Employee_andCompanyInformationManagement {

    public static void main(String[] args) {

        EmployeeCompany e1 =
                new EmployeeCompany("Sarah", 50000);

        EmployeeCompany e2 =
                new EmployeeCompany("Prince", 60000);

        EmployeeCompany e3 =
                new EmployeeCompany("Ali", 55000);

        EmployeeCompany.printCompanyInfo();
    }
}