package org.tnsindia.Framework;

public abstract class SavingAcc extends BankAcc{
	
	
	
	private boolean isSalaried;
	static final private float MINBAL=0.0f;
	
	
	public SavingAcc(int accNo, String accNum, float accBal,boolean isSalaried) {
		super(accNo, accNum, accBal);
		this.isSalaried=isSalaried;
		
		
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account no is"+this.getAccNo());
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
}
