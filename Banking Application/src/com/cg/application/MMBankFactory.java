package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory
{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean issalaried) {
		MMSavingAcc s=new   MMSavingAcc(accNo,accNm,accBal,issalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		MMCurrentAcc c=new   MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return c;
	}

	
}
