package core.serialization;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializaitonEx {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setFirstName("Vivekanand");
		emp.setLastName("Gautam");
		
		try {
			FileOutputStream fileOut = new FileOutputStream("employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in employee.txt file");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}