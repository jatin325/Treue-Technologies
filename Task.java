package Task;

public class Task {
	private String name;
	private String dueDate;
	public Task(String name, String dueDate) {
		super();
		this.name = name;
		this.dueDate = dueDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	
}
