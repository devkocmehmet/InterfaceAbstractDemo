package OOPintro;

public class Student extends User{
	private String schoolClass;
	private String classNumber;
	
	public String getSchoolClass() {
		return schoolClass;
	}
	public void setSchoolClass(String schoolClass) {
		this.schoolClass = schoolClass;
	}
	public String getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
}
