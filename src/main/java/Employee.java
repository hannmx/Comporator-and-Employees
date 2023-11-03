import java.time.LocalDate;

public class Employee {
    private final int yearOfBirth;
    private final int monthOfBirth;
    private final int dayOfBirth;
    private double salary;

    public Employee(int yearOfBirth, int monthOfBirth, int dayOfBirth, double salary) {
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.salary = salary;
    }

    public int compareDates(Employee other) {
        LocalDate date1 = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        LocalDate date2 = LocalDate.of(other.yearOfBirth, other.monthOfBirth, other.dayOfBirth);

        return date1.compareTo(date2);
    }

    public static void increaseSalary(Employee[] employees, double percent) {
        for(Employee employee : employees) {
            if(!(employee instanceof Manager)) {
                employee.salary *= (1 + percent / 100);
            }
        }
    }

    public double getSalary() {
        return salary;
    }
}
