
import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a Calendar object to set the date of birth
        Calendar calendar = Calendar.getInstance();
        calendar.set(1990, Calendar.MAY, 21);
        Date dateOfBirth = calendar.getTime();

        // Create an Employee object
        Employee employee = new Employee("John Doe", dateOfBirth, "IT", "Developer", 75000);

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"))) {
            oos.writeObject(employee);
            System.out.println("Employee object has been serialized to 'data.txt' file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"))) {
            Employee deserializedEmployee = (Employee) ois.readObject();
            System.out.println("Deserialized Employee object:");
            System.out.println(deserializedEmployee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
