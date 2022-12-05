package org.poly;

public class PolyDemo {
	
   
	
	public void family() {
		System.out.println("Family members");
		
	}
	
	public void father(String details ) {
		System.out.println("he is hero");
		System.out.println("He works in company");
	}
	
	public void father(int salary) {
		System.out.println("He earns 30000");
	
	}
	
	public void add(int a , int b) {
		System.out.println("Addition of two numbers  :" + (a+b));
	}
	 public void add(int a, int b, int c ) {
		 System.out.println("Subsraction of two numbers :" + (b-c));
	 }
	public static void main(String[] args) {
		
		PolyDemo pd = new PolyDemo();
		
		
	    pd.family();
		pd.father("details");
		pd.father(0);
		pd.add(15,89);
		pd.add(15, 89, 56);
		

	}

}
