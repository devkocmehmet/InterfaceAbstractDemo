package OOPintro;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Eðitmen eklendi "+user.getFirstName()+" "+user.getLastName());
	}
	
	public void information(Instructor instructor) {
		System.out.println("Eðitmen alaný "+instructor.getDepartment());
		System.out.println("Eðitmen alaný "+instructor.getWorkTime());
	}
}
