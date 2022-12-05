package org.poly;

public class ClientDetails {
	
              private void client(String place) {
                System.out.println("Clinet Location is :"+place);
			}
              
              
              private void client(int age) {
               System.out.println("Client Age is :" + age );
			}
              
              private void client(float fee) {
                    System.out.println("Client paid amount is :" + fee);
			}
	

	public static void main(String[] args) {
		
		ClientDetails detail = new ClientDetails();
		detail.client("Erode");
		detail.client(25);
		detail.client(67000f);
		
		
		

	}

}
