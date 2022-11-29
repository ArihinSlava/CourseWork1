public class EmployeeService {

     public Employee[] employee = new Employee[10];

    public double findSum(Employee[] employee) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }
}
