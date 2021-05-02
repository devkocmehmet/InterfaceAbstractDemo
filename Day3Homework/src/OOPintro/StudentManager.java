package OOPintro;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Öðrenci eklendi "+ user.getFirstName() + " "+user.getLastName());
	}
	
	public void information(Student student) {
		System.out.println("Öðrencinin Sýnýfý "+student.getSchoolClass());
		System.out.println("Öðrencinin Numarasý "+student.getClassNumber());
	}
}
