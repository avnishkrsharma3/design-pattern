package basics.UML;
// parent class
	   class Animal {
		   public void eat() {
			    	System.out.println("Animal is eating.");
		   }
	   }
	   class Dog extends Animal {
		   public void bark() {
			   System.out.println("Dog is barking.");
		   }
	   }
public class InheritanceExample {

	public static void main(String[] args) {
		Dog dog  = new Dog();
		dog.eat(); dog.bark();

	}

}
