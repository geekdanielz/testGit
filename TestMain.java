
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.setStudentId(1);
		student1.setStudentName("Amy");
		student1.setCity("NYC");
		student1.setMarks1(100);
		student1.setMarks2(100);
		student1.setMarks3(100);
		student1.setFeePerMonth(500f);
		student1.setEnableForScholarship(true);
		
		student2.setStudentId(2);
		student2.setStudentName("Bob");
		student2.setCity("GZ");
		student2.setMarks1(90);
		student2.setMarks2(90);
		student2.setMarks3(90);
		student2.setFeePerMonth(400f);
		student2.setEnableForScholarship(true);
		
		student3.setStudentId(3);
		student3.setStudentName("Cindy");
		student3.setCity("HK");
		student3.setMarks1(70);
		student3.setMarks2(50);
		student3.setMarks3(80);
		student3.setFeePerMonth(300f);
		student3.setEnableForScholarship(false);
		
		String highestStudentName; 
		if (student1.getTotalMarks()>=student2.getTotalMarks() && student1.getTotalMarks()>=student3.getTotalMarks()) {
			highestStudentName = student1.getStudentName();
		}
		else if (student2.getTotalMarks()>=student1.getTotalMarks() && student2.getTotalMarks()>=student3.getTotalMarks()) {
			highestStudentName = student2.getStudentName();
		}
		else {
			highestStudentName = student3.getStudentName();
		}
		System.out.println(highestStudentName + " has the highest total marks.");
		
		if (student1.getFeePerMonth()<=student2.getFeePerMonth() && student1.getFeePerMonth()<=student3.getFeePerMonth()) {
			System.out.println(student1.getStudentName() + " has the least monthly fee " + student1.getFeePerMonth());;
		}
		else if (student2.getFeePerMonth()<=student1.getFeePerMonth() && student2.getFeePerMonth()<=student3.getFeePerMonth()) {
			System.out.println(student2.getStudentName() + " has the least monthly fee " + student2.getFeePerMonth());;
		}
		else {
			System.out.println(student3.getStudentName() + " has the least monthly fee " + student3.getFeePerMonth());;
		}
		
		System.out.println("Name: " + student1.getStudentName() + ", total marks: " + String.valueOf(student1.getTotalMarks()) + ", average marks: " + 
				String.valueOf(student1.getAverage()) + ", result: " + student1.getResult() + ", Scholarship " + ((student1.isEnableForScholarship()) ? "available" : "not available"));
		System.out.println("Name: " + student2.getStudentName() + ", total marks: " + String.valueOf(student2.getTotalMarks()) + ", average marks: " + 
				String.valueOf(student2.getAverage()) + ", result: " + student2.getResult() + ", Scholarship " + ((student2.isEnableForScholarship()) ? "available" : "not available"));
		System.out.println("Name: " + student3.getStudentName() + ", total marks: " + String.valueOf(student3.getTotalMarks()) + ", average marks: " + 
				String.valueOf(student3.getAverage()) + ", result: " + student3.getResult() + ", Scholarship " + ((student3.isEnableForScholarship()) ? "available" : "not available"));
	}

}

class Student {
	private int studentId;
	private String studentName;
	private String city;
	private int marks1;
	private int marks2;
	private int marks3;
	private float feePerMonth;
	private boolean isEnableForScholarship;
	
	//getter and setter
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public float getFeePerMonth() {
		return feePerMonth;
	}
	public void setFeePerMonth(float feePerMonth) {
		this.feePerMonth = feePerMonth;
	}
	public boolean isEnableForScholarship() {
		return isEnableForScholarship;
	}
	public void setEnableForScholarship(boolean isEnableForScholarship) {
		this.isEnableForScholarship = isEnableForScholarship;
	}
	
	
	public float getAnualFee() {
		return 12*this.feePerMonth;
	}
	
	public int getTotalMarks() {
		return this.marks1 + this.marks2 + this.marks3;
	}
	
	public float getAverage() {
		return (float)this.getTotalMarks()/3;
	}
	
	public String getResult() {
		if (this.marks1>60 && this.marks2>60 && this.marks3>60) {
			return "pass";
		}
		else {
			return "fail";
		}
	}
}
