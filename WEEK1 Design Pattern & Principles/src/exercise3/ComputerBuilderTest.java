package exercise3;

public class ComputerBuilderTest {
	    public static void main(String[] args) {
	        // Create a basic computer
	        Computer basicComputer = new Computer.Builder()
	                .setCpu("Intel Core i3")
	                .setRam(8)
	                .setStorage("256GB SSD")
	                .build();

	        System.out.println("Basic Computer: ");
	        System.out.println("CPU: " + basicComputer.getCpu());
	        System.out.println("RAM: " + basicComputer.getRam() + "GB");
	        System.out.println("Storage: " + basicComputer.getStorage());

	        // Create a gaming computer
	        Computer gamingComputer = new Computer.Builder()
	                .setCpu("AMD Ryzen 9")
	                .setRam(16)
	                .setStorage("1TB NVMe SSD")
	                .build();

	        System.out.println("\nGaming Computer: ");
	        System.out.println("CPU: " + gamingComputer.getCpu());
	        System.out.println("RAM: " + gamingComputer.getRam() + "GB");
	        System.out.println("Storage: " + gamingComputer.getStorage());
	    }
	}

