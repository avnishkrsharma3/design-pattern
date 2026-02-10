package BehavirouralPatterns.MementoPattern;

import java.util.Stack;

//Caretaker Class: Manage mementos (snapshots of the TextEditor state)
public class CareTaker {
	private final Stack<EditorMemento> history = new Stack<>();
	
	public void saveState(TextEditor textEditor) {
		history.push(textEditor.save());
	}
	
	public void undo(TextEditor editor) {
	    // We need at least 2 items to undo to a previous state
	    if (history.size() > 1) {
	        history.pop(); // Remove current state
	        editor.restore(history.peek()); // Restore previous state
	    } else if (history.size() == 1) {
	        history.pop();
	        editor.restore(new EditorMemento("")); // Reset to empty if last one is gone
	    }
	}
}
