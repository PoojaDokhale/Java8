package snp_VIDHI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainClass {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException {
		/*
		 * Singletone singletone1 = Singletone.getInstance(); Singletone singletone2 =
		 * Singletone.getInstance(); System.out.println(singletone1.hashCode());
		 * System.out.println(singletone2.hashCode());
		 */
		/*
		 * Thread th1 = new Thread(() -> { Singletone singletone1 =
		 * Singletone.getInstance(); System.out.println(singletone1.hashCode());
		 * 
		 * }); Thread th2 = new Thread( () -> { Singletone singletone1 =
		 * Singletone.getInstance(); System.out.println(singletone1.hashCode());
		 * 
		 * }); th1.start(); th2.start();
		 */

		Singletone singletone1 = Singletone.getInstance();
		System.out.println(singletone1.hashCode());
		/*
		 * Singletone singletone2 = (Singletone) singletone1.clone();
		 * 
		 * System.out.println(singletone2.hashCode());
		 */
		/*
		 * Class<?> singletone=Class.forName("snp_VIDHI.Singletone");
		 * Constructor<Singletone> con=(Constructor<Singletone>)
		 * singletone.getDeclaredConstructor(); con.setAccessible(true); Singletone
		 * instance=con.newInstance(); System.out.println(instance.hashCode());
		 */
		FileOutputStream fin = new FileOutputStream("C:\\data\\code\\singletone.ser");
		ObjectOutputStream objout;
		try {
			objout = new ObjectOutputStream(fin);
			objout.writeObject(singletone1);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Singletone newder = null;
		FileInputStream f1=new FileInputStream("C:\\\\data\\\\code\\\\singletone.ser");
		try {
		ObjectInputStream obin=new ObjectInputStream(f1);
	
		newder=(Singletone) obin.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(newder.hashCode());
		
	}

}
