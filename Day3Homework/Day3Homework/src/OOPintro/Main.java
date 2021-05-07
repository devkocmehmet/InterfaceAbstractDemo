package OOPintro;

public class Main {
	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Ali");
		user1.setLastName("Getir");
		user1.setAge(18);
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setFirstName("Fatih");
		student1.setLastName("Yenen");
		student1.setAge(12);
		student1.setSchoolClass("9-E");
		student1.setClassNumber("256");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(3);
		instructor1.setFirstName("Mehmet");
		instructor1.setLastName("Koç");
		instructor1.setAge(22);
		instructor1.setDepartment("Yazılım");
		instructor1.setWorkTime(40);
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.information(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.information(instructor1);
	}

}
