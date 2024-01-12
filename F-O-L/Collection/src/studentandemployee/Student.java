package studentandemployee;

public class Student {
	private int id;
	private String name;
	private int rollno;
	private int classnumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getClassnumber() {
		return classnumber;
	}
	public void setClassnumber(int classnumber) {
		this.classnumber = classnumber;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", classnumber=" + classnumber + "]";
	}
	public Student(int id, String name, int rollno, int classnumber) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.classnumber = classnumber;
	}
	public Student() {
		super();
	}
	
	
}
