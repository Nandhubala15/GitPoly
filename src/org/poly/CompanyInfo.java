package org.poly;
// based on different number of data type
public class CompanyInfo {
	
	private void companyName(String name, int number) {
         System.out.println("Use different number of datatype \n"+ name);
	}

	private void companyName(String name, float number) {
        System.out.println("Use different number of datatype \n" + name);
        
	}
	private void companyName(String name, long id) {
       System.out.println("Use different typr of data type \n" +name);
	}
	
	public static void main(String[] args) {
		
		CompanyInfo cn = new CompanyInfo();
		
		cn.companyName("Wipro ", 890);
		cn.companyName("TCS", 78.90f);
		cn.companyName("Accenture", 57893l);
		
		
		
	}
}
 