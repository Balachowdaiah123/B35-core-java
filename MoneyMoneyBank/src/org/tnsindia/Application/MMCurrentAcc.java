package org.tnsindia.Application;

import org.tnsindia.Framework.CurrentAcc;

public abstract class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo,String accNm,float accBal,float creditLimit)
	{
		super(accNo, accNm, accBal,creditLimit);
	}
	
	@Override
	public void withdraw(float accBal)
	{
		System.out.println(accBal);
	}
	
	@Override
	public String toString() 
	{
		return String.format("MMCurrentAcc [toString=%s]",super.toString());
	}

	}
	

}
