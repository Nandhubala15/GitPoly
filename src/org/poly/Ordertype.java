package org.poly;

public class Ordertype {
	
	// different datatype order in data type
	
	private void phoneInfo(long phNo, double num) {
		System.out.println("Enter the phone number  :"  + phNo	);	
		} 
	
	private void phineInfo(double num, long phNo) {
		System.out.println("Enter the Phone number  : " + phNo);
		

	}

	public static void main(String[] args) {
		
		Ordertype pd =  new Ordertype();
		
		pd.phoneInfo(9047922897l, 67);
		pd.phineInfo(678, 9965286003l);

	}

}
