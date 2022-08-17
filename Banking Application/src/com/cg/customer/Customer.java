package com.cg.customer;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Customer {

	public static void main(String[] args)
	{
		BankFactory f=new MMBankFactory();
		CurrentAcc a=new MMCurrentAcc(11,"Prerana",550.5f, 50000.5f);
		SavingAcc d=new MMSavingAcc(12,"Geeta",660.5f,true);
		// for saving account output
		System.out.println("Saving Account:");
		d.withdraw(d.getAccBal());
		// for current account output
		System.out.println("Current Account:");
		a.withdraw(a.getAccBal());
		System.out.println(a);
		System.out.println(d);
		

	}

}
