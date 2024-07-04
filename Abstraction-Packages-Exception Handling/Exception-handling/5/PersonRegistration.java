class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class PersonRegistration{
    public static void main(String[] args) {
        if(args.length <2){
            System.out.println("Please provide name and age as arguments.");
            return;
        }
        String name = args [0];
        int age;

        try {
            age = Integer.parseInt(args[1]);
            registerPerson(name,age);
        } catch (NumberFormatException e) {
            System.out.println("Age must be a valid integer.");
        }catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    public static void registerPerson(String name , int age)throws InvalidAgeException {
        if (age<18 || age >= 60){
            throw new InvalidAgeException("Age must be between 18 and 59.");
        }
        else{
            System.out.println("Person registration done successfully");
            System.out.println("Name: "+name);
            System.out.println("Age: "+ age);
        }
        
    }
}