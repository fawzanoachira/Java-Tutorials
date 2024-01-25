package arrayListSortingUsingComparable;

public class Student implements Comparable<Student>{
	private Integer stdId;
	private String stdName;
	private String stdAddress;
	private int stdMarks;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public int getStdmarks() {
		return stdMarks;
	}
	public void setStdmarks(int stdMarks) {
		this.stdMarks = stdMarks;
	}
	public Student(Integer stdId, String stdName, String stdAddress, int stdMarks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAddress = stdAddress;
		this.stdMarks = stdMarks;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAddress=" + stdAddress + ", stdMarks="
				+ stdMarks + "]";
	}
	@Override
	public int compareTo(Student o) {
//		return this.stdId.compareTo(o.stdId);
		
//		OR
		
		if(this.getStdId()==o.stdId) {
			return 0;
		}
		else if(this.getStdId()<o.stdId) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	
}
