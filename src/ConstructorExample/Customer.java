package ConstructorExample;
//lead: means probable cusotmer here
//sales point of view lead is a probable customer.
public class Customer {
	int id;
	String name;
	//Default constructor
	public Customer() {
	
	}
  //paramterized constructor
	public Customer(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	//Copy Constructor this object copy values from another object.
	//this happens when handshake between the objects.set the value,pass the value and search the value.
	public Customer(Customer obj2){
		this.id= obj2.id;
		this.name = obj2.name;
	}
	
	
}
