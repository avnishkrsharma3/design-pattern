package basics.UML;

// Teacher class
 class Teacher {
	private String name;
	
	public Teacher(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void teach (Student student) {
		System.out.println(name +" is teaching to " + student.getName());
	}
}
 // Student class
 
  class Student {
	  private String name;
		
		public Student(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
  }



public class AssociationExample {

	public static void main(String[] args) {
		Student student = new Student("Avnish");
		Teacher teacher = new Teacher("Prateek Narang");
        // Association between teacher and student
		teacher.teach(student);
	}

}
