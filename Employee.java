public class Employee {
    String name;
    int age;
    String Department;

    public Employee(){ // default Constructor
        this.name = "Employee";
        this.age = 25;
        this.Department = "IT";
    }

    //parameterised Constructor
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.Department = department;
    }
}
