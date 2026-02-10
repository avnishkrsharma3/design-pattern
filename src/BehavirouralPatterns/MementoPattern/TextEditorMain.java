package BehavirouralPatterns.MementoPattern;

public class TextEditorMain {

	public static void main(String[] args) {
		
		TextEditor textEditor = new TextEditor();
		CareTaker careTaker = new CareTaker();
		
		textEditor.write("Avnish");
		careTaker.saveState(textEditor);
		
		textEditor.write("Prateek");
		careTaker.saveState(textEditor);
		
		textEditor.write("Rahul");	
		careTaker.saveState(textEditor);
		
		careTaker.undo(textEditor);
		System.out.println(textEditor.getContent());
	}

}
