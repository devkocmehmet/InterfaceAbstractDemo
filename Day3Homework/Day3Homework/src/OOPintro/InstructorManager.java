package OOPintro;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("E�itmen eklendi "+user.getFirstName()+" "+user.getLastName());
	}
	
	public void information(Instructor instructor) {
		System.out.println("E�itmen alan� "+instructor.getDepartment());
		System.out.println("E�itmen alan� "+instructor.getWorkTime());
	}
}
