package CourseWork1;

import java.util.Objects;

public class Employee {
    private final int id;
    private static int count = 1;
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private double salary;

    public Employee(String firstName, String middleName, String lastName, int department, int salary) {
        this.id = count++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Номер в реестре " + id +". Ф.И.О. сотрудника: " + getFirstName() + " " + getMiddleName() + " " +  getLastName() +". Отдел: " + getDepartment() +". Оклад: " + getSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && salary == employee.salary && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, department, salary);
    }
}
