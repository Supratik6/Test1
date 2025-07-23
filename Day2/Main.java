class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Human {
    private String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
}

class Employee extends Human {
    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
}

public class Main {
    public static void main(String[] args) {
        Human human = new Human("John", 30);
        System.out.println("Human:");
        System.out.println("Name: " + human.getName());
        System.out.println("Age: " + human.getAge());
        System.out.println();

        Student student = new Student("Alice", 20, "Harvard");
        System.out.println("Student:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("School: " + student.getSchool());
        System.out.println();

        Employee employee = new Employee("Bob", 40, "Google");
        System.out.println("Employee:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Company: " + employee.getCompany());
    }
}
