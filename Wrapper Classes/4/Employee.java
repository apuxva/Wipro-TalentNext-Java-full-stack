/*Create an employee class with properties of your choice. Create an object of this class and 
also create a clone of the same. After making the clone, change the properties of the original 
employee object and print the properties of both the original and clone object and note down your observation. */

class Employee implements Cloneable {
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Overriding the clone method to enable cloning of Employee objects
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Overriding the toString method for easy printing of Employee objects
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        try {
            // Create an original Employee object
            Employee original = new Employee("John Doe", 30, 75000);

            // Clone the original Employee object
            Employee clone = (Employee) original.clone();

            // Change properties of the original Employee object
            original.setName("Jane Smith");
            original.setAge(28);
            original.setSalary(80000);

            // Print properties of both original and clone objects
            System.out.println("Original Employee: " + original);
            System.out.println("Cloned Employee: " + clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
