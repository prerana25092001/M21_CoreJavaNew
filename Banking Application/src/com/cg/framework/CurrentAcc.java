package com.cg.framework;

public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit;
     // constructor
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
		
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account number is:" + this.getAccNo() + "Account Name is:" + this.getAccNm()
		+ "Account Balance is:" + (creditLimit+accBal));
		
	}
	@Override
	public String toString()
	{
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	
	
	
	

}
