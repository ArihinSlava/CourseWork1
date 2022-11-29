public class Employee {
    private final int id;
    private static int count = 1;
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private int salary;

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

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id +". ФИО: " + getFirstName() + " " + getMiddleName() + " " +  getLastName() +". Отдел: " + getDepartment() +". Оклад: " + getSalary();
    }
}
