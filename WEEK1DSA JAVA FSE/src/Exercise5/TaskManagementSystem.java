package Exercise5;
class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}
public class TaskManagementSystem {
	 private Node head;

	    public TaskManagementSystem() {
	        this.head = null;
	    }

	    // Add task
	    public void addTask(Task task) {
	        Node newNode = new Node(task);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    // Search task by taskId
	    public Task searchTask(int taskId) {
	        Node current = head;
	        while (current != null) {
	            if (current.task.getTaskId() == taskId) {
	                return current.task;
	            }
	            current = current.next;
	        }
	        return null;
	    }

	    // Traverse tasks
	    public void traverseTasks() {
	        Node current = head;
	        while (current != null) {
	            System.out.println(current.task);
	            current = current.next;
	        }
	    }

	    // Delete task by taskId
	    public boolean deleteTask(int taskId) {
	        if (head == null) {
	            return false;
	        }

	        if (head.task.getTaskId() == taskId) {
	            head = head.next;
	            return true;
	        }

	        Node current = head;
	        while (current.next != null) {
	            if (current.next.task.getTaskId() == taskId) {
	                current.next = current.next.next;
	                return true;
	            }
	            current = current.next;
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        TaskManagementSystem system = new TaskManagementSystem();
	        system.addTask(new Task(1, "Design database", "In Progress"));
	        system.addTask(new Task(2, "Implement API", "Not Started"));
	        system.addTask(new Task(3, "Test application", "In Progress"));

	        System.out.println("All Tasks:");
	        system.traverseTasks();

	        System.out.println("\nSearching for Task with ID 2:");
	        System.out.println(system.searchTask(2));

	        System.out.println("\nDeleting Task with ID 2:");
	        system.deleteTask(2);

	        System.out.println("\nAll Tasks after deletion:");
	        system.traverseTasks();
	    }
}
