package com.cg.framework;

public abstract class SavingAcc extends BankAcc 
{
    private boolean isSalaried;
    private static final float MINBAL = 0;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account number is:" + this.getAccNo()+"Account Name is:" + this.getAccNm()
		+ "Account Balance is:" + accBal);
		
	}
	@Override
	public String toString() 
	{
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}
	
	
	

}
