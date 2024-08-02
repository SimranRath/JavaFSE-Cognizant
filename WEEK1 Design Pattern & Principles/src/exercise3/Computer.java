package exercise3;

public class Computer {
	    private String cpu;
	    private int ram;
	    private String storage;

	    // Private constructor to ensure Builder is used
	    private Computer(Builder builder) {
	        this.cpu = builder.cpu;
	        this.ram = builder.ram;
	        this.storage = builder.storage;
	    }

	    public String getCpu() {
	        return cpu;
	    }

	    public int getRam() {
	        return ram;
	    }

	    public String getStorage() {
	        return storage;
	    }

	    // Static nested Builder class
	    public static class Builder {
	        private String cpu;
	        private int ram;
	        private String storage;

	        public Builder setCpu(String cpu) {
	            this.cpu = cpu;
	            return this;
	        }

	        public Builder setRam(int ram) {
	            this.ram = ram;
	            return this;
	        }

	        public Builder setStorage(String storage) {
	            this.storage = storage;
	            return this;
	        }

	        public Computer build() {
	            return new Computer(this);
	        }
	    }

}
