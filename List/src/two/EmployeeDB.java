package two;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
	ArrayList<Employee> list;
	
    EmployeeDB() {
		list = new ArrayList<>();
	}
    
    boolean addEmployee(Employee e) {
    	return list.add(e);
    }
    
    boolean deleteEmployee(int empId) {
    	Iterator<Employee> iterator = list.iterator();
    	while (iterator.hasNext()) {
    		Employee e = iterator.next();
    		if(e.getEmpId()== empId) {
    			iterator.remove();
    			return true;
    		}
    	}
    	return false;
    }
    
    public String showPaySlip(int empId) {
    	for (Employee e : list) {
    		if(e.getEmpId()== empId) {
    			return "Payslip for Employee ID" +empId + ": " + e.getSalary();
    		}
    	}
    	return "Employee not found";
    }
    public void displayAllEmployee() {
    	for(Employee e : list) {
    		e.getEmployeeDetails();
    		System.out.println("-----------------------------------");
    	}
    }
    
    public static void main (String[] args ) {
    	EmployeeDB empDB = new EmployeeDB();
    	
    	Employee emp1 = new Employee(01, "Apurva Patil", "aapurvaapatil@gmail.com", "Female" , 75000.00f);
    	Employee emp2 = new Employee(02, "Shreya Tiwari", "shreyatiwari@gmail.com", "Female" , 85000.00f);
    	Employee emp3 = new Employee(03, "Apu Patil", "aapapatil@gmail.com", "Female" , 79000.00f);
    	empDB.addEmployee(emp1);
    	empDB.addEmployee(emp2);
    	empDB.addEmployee(emp3);
    	
    	System.out.println(empDB.showPaySlip(2));
    	empDB.deleteEmployee(1);
    	System.out.println("All Employees after deletion:");
        empDB.displayAllEmployee();
    	
    }
    
}
