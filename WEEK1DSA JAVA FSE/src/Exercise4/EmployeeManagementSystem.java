package Exercise4;
public class EmployeeManagementSystem {
	 private Employee[] employees;
	    private int size;

	    public EmployeeManagementSystem(int capacity) {
	        employees = new Employee[capacity];
	        size = 0;
	    }

	    public boolean addEmployee(Employee employee) {
	        if (size == employees.length) {
	            return false; // No space left to add a new employee
	        }
	        employees[size++] = employee;
	        return true;
	    }

	    public Employee searchEmployee(int employeeId) {
	        for (int i = 0; i < size; i++) {
	            if (employees[i].getEmployeeId() == employeeId) {
	                return employees[i];
	            }
	        }
	        return null; // Employee not found
	    }

	    public void traverseEmployees() {
	        for (int i = 0; i < size; i++) {
	            System.out.println(employees[i]);
	        }
	    }

	    public boolean deleteEmployee(int employeeId) {
	        for (int i = 0; i < size; i++) {
	            if (employees[i].getEmployeeId() == employeeId) {
	                // Shift elements to the left to fill the gap
	                for (int j = i; j < size - 1; j++) {
	                    employees[j] = employees[j + 1];
	                }
	                employees[size - 1] = null; // Clear the last element
	                size--;
	                return true;
	            }
	        }
	        return false; // Employee not found
	    }

	    public static void main(String[] args) {
	        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

	        system.addEmployee(new Employee(1, "Alice", "Manager", 90000));
	        system.addEmployee(new Employee(2, "Bob", "Developer", 80000));
	        system.addEmployee(new Employee(3, "Charlie", "Designer", 70000));

	        System.out.println("All Employees:");
	        system.traverseEmployees();

	        System.out.println("\nSearching for Employee with ID 2:");
	        System.out.println(system.searchEmployee(2));

	        System.out.println("\nDeleting Employee with ID 2:");
	        system.deleteEmployee(2);

	        System.out.println("\nAll Employees after deletion:");
	        system.traverseEmployees();
	    }
}
