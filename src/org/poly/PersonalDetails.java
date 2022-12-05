package org.poly;

public class PersonalDetails {
	
	private void myInfo() {
		System.out.println("\t ABOUT ME");
        System.out.println("==================");
	}
	
	private void myInfo(String name) {
       System.out.println("Name is :" + name);
	}
	
	private void myInfo(int age, String dob) {
       System.out.println("age is :" + age);
	}
	private void myInfo(float height) {
		System.out.println("Height is :" + height);

	}
	private void myInfo(long phoneNumber) {
		System.out.println("Phone Number :" + phoneNumber);
	}
	private void myInfo(String ncccl, long id) {
		System.out.println("Company :" + ncccl);
	}
	private void myInfo(float salary, int weight) {
		System.out.println("Salary :" + salary);
		
	}
	public static void main(String[] args) {
		
		PersonalDetails pd = new PersonalDetails();
		
		pd.myInfo();
		pd.myInfo("Nandhini");
		pd.myInfo(26, "June15");
		pd.myInfo(156.7f);
		pd.myInfo(6374138893l);
		pd.myInfo("NCCCL", 6789878l);
		pd.myInfo(22000.0f, 55);
		

	}

}
