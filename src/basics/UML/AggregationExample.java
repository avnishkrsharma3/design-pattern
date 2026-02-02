package basics.UML;

import java.util.Arrays;
import java.util.List;
// Aggregation is weak has a relationship
public class AggregationExample {

	public static void main(String[] args) {
		Professor professor1 = new Professor("Avnish");
		Professor professor2 = new Professor("Ankit");
		Professor professor3 = new Professor("David");
		Professor professor4 = new Professor("Mohan");
		Professor professor5 = new Professor("Suraj");
		 // Aggregation relationship: department has professors, but professors exist independently
		List<Professor> list = Arrays.asList(professor1, professor2, professor3, professor4, professor5);
		Department department = new Department(list, "Computer Science");
		department.showProfessors();
	}
	

}

	class Professor {
		private String name;
		public Professor(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
	}
	
	class Department {
		List<Professor> professors ;
		String name ;
		
		public Department(List<Professor> professors, String name) {
			this.professors = professors;
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
		public void showProfessors() {
	        System.out.println("Department: " + name);
	        for (Professor prof : professors) {
	            System.out.println(prof.getName());
	        }
	    }
	}
	
	
	
	
	
	
	
	
	