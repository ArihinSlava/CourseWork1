public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Вячеслав", "Леонидович", "Арихин", 1, 15000);
        employee[1] = new Employee("Александр", "Александрович", "Иванов", 1, 17500);
        employee[2] = new Employee("Владимир", "Владимирович", "Синцов", 2, 45500);
        employee[3] = new Employee("Сергей", "Геннадьевич", "Хренов", 2, 35000);
        employee[4] = new Employee("Валерий", "Сергеевич", "Кудрин", 3, 30000);
        employee[5] = new Employee("Валерия", "Сергеевна", "Туманова", 3, 40000);
        employee[6] = new Employee("Юлия", "Владимировна", "Михеева", 4, 65000);
        employee[7] = new Employee("Наталья", "Александровна", "Сергеева", 4, 37500);
        employee[8] = new Employee("Виктория", "Юрьевна", "Малышко", 5, 64000);
        employee[9] = new Employee("Марина", "Викторовна", "Румянцева", 5, 55500);

        for (Employee i : employee) {
            System.out.println(i);
        }
        System.out.println("Сумма затрат за месяц " +  employeeService.findSum(employee));


    }
}