package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(43245, "John Due");
		Employee1 emp1=new Employee1(23434, "Abc");

		// Serialize
		FileOutputStream f1;
		try {
			f1 = new FileOutputStream("C:\\data\\code\\Java8Test\\src\\multithreading\\employee.ser");
			ObjectOutputStream objout;
			objout = new ObjectOutputStream(f1);
			objout.writeObject(e1);
			objout.writeObject(emp1);
			objout.close();
			f1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// DEserialize

		FileInputStream fin;
		try {
			fin = new FileInputStream("C:\\data\\code\\Java8Test\\src\\multithreading\\employee.ser");
			ObjectInputStream objIn;
			objIn = new ObjectInputStream(fin);
			Employee em = (Employee) objIn.readObject();
			Integer em1 = (Integer) objIn.readInt();
			System.out.println(em.toString());
			System.out.println(em1.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
