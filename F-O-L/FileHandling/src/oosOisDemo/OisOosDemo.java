package oosOisDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class OisOosDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s = new Student(1, "fawzan", 23);
		FileOutputStream fos = new FileOutputStream("/home/fawzan/eclipse-workspace/FileHandling/src/oosOisDemo/notes.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();
		fos.close();
		
		FileInputStream fis = new  FileInputStream("/home/fawzan/eclipse-workspace/FileHandling/src/oosOisDemo/notes.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		System.out.println(object);
		ois.close();
		fis.close();
	}
}

class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}