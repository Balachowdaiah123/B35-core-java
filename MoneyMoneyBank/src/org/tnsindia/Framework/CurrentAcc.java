package org.tnsindia.Framework;

public abstract class CurrentAcc extends BankAcc{
	
	private final float creditLimite;

	public CurrentAcc(int accNo, String accNum, float accBal,float creditLimite) {
		super(accNo, accNum, accBal);
		this.creditLimite=creditLimite;
	}
	
	public void withdraw(float accBal)
	{
		System.out.println("Account no is"+this.getAccNo());
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimite=" + creditLimite + "]";
	}

	protected abstract char[] getNewCurrentAcc(int i, String string, int j, int k);
	
	
	

}
