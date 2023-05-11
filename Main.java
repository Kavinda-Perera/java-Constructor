public class Main {
    public static void main(String[] args) {


        // default constructor
        Employee e1 = new Employee();
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.Department);

        System.out.println();

        //parameterised Constructor
        Employee e2 = new Employee("Kavinda",23,"IT");
        System.out.print(e2.name+"\n"+e2.age+"\n"+e2.Department);

    }

}
