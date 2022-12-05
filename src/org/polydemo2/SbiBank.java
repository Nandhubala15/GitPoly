package org.polydemo2;

public class SbiBank extends BankDetails {
	@Override
	public void deposit() {
		
	System.out.println("Sbi bank deposit interest 5.50%");
	}

	public static void main(String[] args) {
		SbiBank sb = new SbiBank();
		sb.saving();
		sb.fixed();
		sb.deposit();
		
	}

	}


