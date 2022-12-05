package org.poly;
// based on different datatype in arguements
 
public class Employee {
	
	public void empId(int id) {
		System.out.println("Employee 1 ID Number :" + id);
	
	}
	public void emId(long id3) {
		System.out.println("Employee 2 ID number :" + id3);
	}
	public void empId(float id4) {
		System.out.println("Employee 3 ID Number : " + id4);
	}
	

	public static void main(String[] args) {
		
     Employee emp = new Employee();
     
     emp.empId(609);
     emp.emId(56789l);
     emp.empId(678f);
     
     
    
	}
	

}
