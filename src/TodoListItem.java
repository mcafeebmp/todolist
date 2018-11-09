
public class TodoListItem {
	String description;
	int priority;
	boolean isdone;
	
    public TodoListItem(String description, int priority) {
    	this.description = description;
    	this.priority = priority;
    	this.isdone = false;
    	
    }
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	public int getPriority() {
		// TODO Auto-generated method stub
		return this.priority;
	}

	public Object isDone() {
		// TODO Auto-generated method stub
		return this.isdone;
	}

	public void markDone() {
		// TODO Auto-generated method stub
		this.isdone = true;
		
	}

}
