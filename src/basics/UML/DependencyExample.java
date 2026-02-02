package basics.UML;

//A "using" relationship where one object uses another object temporarily to perform a task. 
//It is the weakest form of relationship.
/*
 *  Feature,  			Association,    			Dependency
	Link Strength,		Strong/Permanent,			Weak/Temporary
  	UML Symbol,			Solid Line,					Dashed Arrow (-->)
	Code Structure,		Stored as a Field.,			Passed as a Parameter.
	Analogy,			A person and their Phone.,	A person and a Public ATM.
 */


public class DependencyExample {
	public static void main(String args[]) {
		Document doc = new Document ("This is the content, that need to be printed");
		Printer printer = new Printer();
		printer.print(doc);
	}
	
}


class Document {
	public String content;
	
	public Document (String content) {
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}
}

class Printer {
	public void print(Document doc) {
		System.out.println("Printing document: " + doc.getContent());
	}
}



