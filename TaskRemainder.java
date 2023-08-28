package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskRemainder {
	private List<Task> tasks;
	private Scanner scanner ;
	public TaskRemainder() {
		tasks=new ArrayList<>();
		scanner=new Scanner(System.in);
		
	}
	public void addtask() {
		System.out.println("enter your task name");
		String name =scanner.nextLine();
		System.out.println("enter due Date");
		String  dueDate=scanner.nextLine();
		Task task=new Task(name,dueDate);
		tasks.add(task);
		System.out.println("task added sucess");
		
	}
	public void viewTask() {
		if(tasks.isEmpty()) {
			System.out.println("no task dispaly");
		}
		System.out.println("Tasks:");
	    for (int i = 0; i < tasks.size(); i++) {
	        Task task = tasks.get(i);
	        System.out.println((i + 1) + ". " + task.getName() + " (Due: " + task.getDueDate() + ")");
	    

	}
	}
	public void start() {
		boolean running=true;
		while(running) {
			System.out.println("/n TaskRemainder");
			System.out.println("1.addnew task");
			System.out.println("2.view Task");
			System.out.println("3.enter your choice");
			
			int choice=scanner.nextInt();
			scanner.nextLine();

            switch (choice) {
                case 1:
                    addtask();
                    break;
                case 2:
                    viewTask();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskRemainder rx=new TaskRemainder();
		rx.start();
	}

}
