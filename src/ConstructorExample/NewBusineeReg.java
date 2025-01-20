package ConstructorExample;

public class NewBusineeReg {

	public static void main(String[] args) {
		Customer infoLead = new Customer(1,"Khushal");
		System.out.println("infolead data:"+infoLead.id);
		Customer newBusiness = new Customer(infoLead);		 
		System.out.println("newbusiness data"+newBusiness.id);
		Customer sampleCustomer = new Customer();
		System.out.println("default customer id"+sampleCustomer.id);
	}
}
