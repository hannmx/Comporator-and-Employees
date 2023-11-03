
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee(2002, 12, 5, 50000);
        employees[1] = new Manager(1990, 2, 19, 80000);

        Employee.increaseSalary(employees, 10);

        int comparisonResult = employees[0].compareDates(employees[1]);

        if (comparisonResult > 0) {
            System.out.println("Первый сотрудник моложе второго.");
        } else if (comparisonResult < 0) {
            System.out.println("Первый сотрудник старше второго.");
        } else {
            System.out.println("Сотрудники родились в один день.");
        }

        for(Employee employee : employees) {
            System.out.printf("Зарплата: " + "%.3f\n", employee.getSalary());
        }
    }
}
