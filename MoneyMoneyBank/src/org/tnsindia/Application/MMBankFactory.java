package org.tnsindia.Application;

import org.tnsindia.Framework.BankFactory;
import org.tnsindia.Framework.CurrentAcc;
import org.tnsindia.Framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc p=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return p;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc n=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return n;
	}



}

