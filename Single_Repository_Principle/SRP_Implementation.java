package Single_Repository_Principle;

class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary){
        this.name= name;
        this.id=id;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
 class SRP_Implementation {
    public void saveToDatabase(Employee employee){
        System.out.println("Employee "+employee.getName()+" saved to database.");    //Code to save employee data to the database
    }
}

class Main{
    public static void main(String[] args) {
        Employee employee = new Employee("Pratham Mishra",21,100000000.0);      //Create an Employee object

        SRP_Implementation srpImplementation = new SRP_Implementation();       // Save employee to database
        srpImplementation.saveToDatabase(employee);
    }
}
/*      The Employee class is responsible for holding employee information such as name, ID, and salary. It has methods to set and get this information.

The SRP_Implementation class is responsible for persisting employee data to the database. It has a method saveToDatabase() which takes an Employee object as input and saves its data to the database. In this example, it simply prints a message indicating that the employee has been saved to the database.

In the Main class, an Employee object is created and then saved to the database using the SRP_Implementation class. This separation of concerns adheres to the Single Responsibility Principle, as each class has only one responsibility.*/