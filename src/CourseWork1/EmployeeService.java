package CourseWork1;

public class EmployeeService {

    public Employee[] employee = new Employee[10];

    public double findSum(Employee[] employee) {
        double salarySum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                salarySum += employee[i].getSalary();
            }
        }
        return salarySum;
    }

    public double calculateAverageSalary(Employee[] employee) {
        double averageSalary;
        int elementCount = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                elementCount++;
            }
        }
        averageSalary = findSum(employee) / elementCount;
        return averageSalary;
    }

    public static void maxSalaryEmployee(Employee[] employee) {
        double maxSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() > maxSalary) {
                    maxSalary = employee[i].getSalary();
                }
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (maxSalary == employee[i].getSalary()) {
                    System.out.println("У сотрудника: " + employee[i].getFirstName() + " " + employee[i].getMiddleName() + " " + employee[i].getLastName() + ". Самая высокая запрлата: " + maxSalary);
                }
            }
        }
    }

    public static void minSalaryEmployee(Employee[] employee) {
        double minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() < minSalary) {
                    minSalary = employee[i].getSalary();
                }
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() == minSalary) {
                    System.out.println("У сотрудника: " + employee[i].getFirstName() + " " + employee[i].getMiddleName() + " " + employee[i].getLastName() + ". Самая низкая зарплата " + minSalary);
                }
            }
        }
    }

    public static void printAllName(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFirstName() + " " + employee[i].getMiddleName() + " " + employee[i].getLastName());
        }
    }
    }






