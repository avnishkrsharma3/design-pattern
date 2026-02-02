package basics.UML;

import java.util.ArrayList;
import java.util.List;
// it is string has a relationship. container object contains content. content can't exit without container
public class CompositionExample {
	public static void main(String args[]) {
		  // If the house is destroyed, the rooms are also destroyed
		House house = new House("Mamta Kunj");
		house.showRoom();
	}
}

// Room class
class Room {
	private String name;
	
	public Room(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}

//House class (Composition relationship)
class House {
	private String name;
	private List<Room> rooms ;
	
	public House(String name) {
		List<Room> list = new ArrayList<>();
		list.add(new Room("three Bedroom"));
		list.add(new Room("Living Room"));
		list.add(new Room("Kitchen"));
		rooms = list;
		this.name = name;
	}
	
	public void showRoom() {
		System.out.println(this.name + " contains " );
		for(Room room : rooms) {
			System.out.println(room.getName());
		}
	}
	
}










