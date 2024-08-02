package Exercise1;

public class Product {
	String PID;
	String Pname; 
	int quantity;
	double price;
	 Product(String PID, String Pname,int quantity,double price) {
	this.PID=PID;
	this.Pname=Pname;
	this.quantity=quantity;
	this.price=price;
	
	}
	
	 public String getPID(){
		 return PID;
	 }
	 public void setPID(String PID){
		 this.PID=PID;
	 }
	 public String getPname() {
		 return Pname;
	 }
	 public void setPname(String Pname) {
		 this.Pname= Pname;
	 }
	 public int getquantity() {
		 return quantity;
	 }
	 public void setquantity(int quantity) {
		 this.quantity=quantity;
	 }
	 public double getprice() {
		 return price;
	 }
	 public void setprice(double price) {
		 this.price= price;
	 }

}
