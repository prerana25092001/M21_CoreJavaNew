package com.cg.framework;

public abstract class BankFactory 
{
	//abstract method
 abstract public SavingAcc getNewSavingAcc( int accNo, String accNm,float accBal, boolean issalaried);

 abstract public CurrentAcc getNewCurrentAcc( int accNo, String accNm,float accBal, float creditLimit );
	



}
