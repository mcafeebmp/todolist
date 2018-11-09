import java.util.ArrayList;
import java.util.List;

public class TodoList {
	private final List<TodoListItem> listOfItems = new ArrayList();
    /*
     * Add a new item to the list, given a description and priority.
     */
    public void addItem(String description, int priority) {
        // TODO
    	TodoListItem item = new TodoListItem(description, priority);
    	listOfItems.add(item);
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int i) {
        // TODO
    	return listOfItems.get(i);
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
        // TODO
        return listOfItems.size();
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        // TODO
    	if 
        return null;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
        // TODO
        return null;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
        // TODO
        return null;
    }
}
