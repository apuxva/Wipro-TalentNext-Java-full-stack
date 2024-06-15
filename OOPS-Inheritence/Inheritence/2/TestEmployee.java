public class TestEmployee {
    public static void main(String[] args) {
        
        Employee e = new Employee("Apurva",1000000, 2025, "797513");
        System.out.println("Details of Employee:");
        System.out.println("Name: " + e.getName());
        System.out.println("Year Of Starting: " + e.getYearOfStart());
        System.out.println("Annual Salary: " + e.getAnnualSalary());
        System.out.println("Insurance Number: " + e.getInsuranceNumber());
    }
}
