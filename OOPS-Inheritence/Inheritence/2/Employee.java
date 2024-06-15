public class Employee extends Person {
    double annualSalary;
    int yearOfStart;
    String insuranceNumber;

    Employee(){
        name = "noname";
        annualSalary = 1000000;
        yearOfStart = 2025;
        insuranceNumber = "0142759";
    }

    Employee(String name , double salary, int year, String insurance){
        this.name = name; //using this because name belongs to the superclass
        annualSalary = salary;
        yearOfStart = year;
        insuranceNumber = insurance;
    }

    //getter methods
    String getName (){
        return name;
    }

    double getAnnualSalary(){
        return annualSalary;
    }

    int getYearOfStart(){
        return yearOfStart;
    }

    String getInsuranceNumber(){
        return insuranceNumber;
    }
    
}
