package OOPintro;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("��renci eklendi "+ user.getFirstName() + " "+user.getLastName());
	}
	
	public void information(Student student) {
		System.out.println("��rencinin S�n�f� "+student.getSchoolClass());
		System.out.println("��rencinin Numaras� "+student.getClassNumber());
	}
}
