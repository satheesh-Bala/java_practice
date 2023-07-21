import java.util.*;

class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    Employee(String n, int y, double s, String a) {
        name = n;
        yearOfJoining = y;
        salary = s;
        address = a;
    }

    void displayInfo() {
        System.out.println(name + " " + yearOfJoining + " " + address);
    }
}

public class employeeDetails {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, 50000.0, "64C- WallsStreat");
        Employee emp2 = new Employee("Sam", 2000, 40000.0, "68D- WallsStreat");
        Employee emp3 = new Employee("John", 1999, 45000.0, "26B- WallsStreat");

        System.out.println("Name Year of joining Address");
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}

