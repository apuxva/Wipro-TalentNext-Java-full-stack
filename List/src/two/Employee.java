/*1) Create an application for employee management with the following classes:
a) Create an Employee class with following attributes and behaviors :
i) int empId ii) String empName iii)String email iv) String gender
v) float salary
vi) void GetEmployeeDetails() →> prints employee details
b) Create one more class EmployeeDB with the following attributes and behaviors.
(i) ArrayList list;
ii) boolean addEmployee(Employee e) > adds the employee object to the collection iii) boolean deleteEmployee(int empId) >delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId) →> returns the payslip of the employee with the given empId
Provide implementation for all the methods and test your program.*/

package two;

public class Employee {
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	
	public Employee(int empId, String empName, String email, String gender, float salary) {
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	public int getEmpId() {
        return empId;
    }

    public float getSalary() {
        return salary;
    }

	
	public void getEmployeeDetails() {
		System.out.println("EmployeeID: " + empId);
		System.out.println("Employee Name: " + empName );
		System.out.println("Employee email: " + email);
		System.out.println("Employee gender: " + gender );
		System.out.println("Employee salary: " + salary);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(01,"Apurva Patil", "aapurvaapatil@gmail.com" , "Female", 10000.00f);
		emp.getEmployeeDetails();
	}

}
