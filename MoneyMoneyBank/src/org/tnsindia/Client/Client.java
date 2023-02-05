package org.tnsindia.Client;

import org.tnsindia.Application.MMBankFactory;
import org.tnsindia.Application.MMCurrentAcc;
import org.tnsindia.Application.MMSavingAcc;
import org.tnsindia.Framework.BankFactory;
import org.tnsindia.Framework.CurrentAcc;
import org.tnsindia.Framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		    BankFactory f=new MMBankFactory();
			SavingAcc p= new MMSavingAcc(809698682,"kothapalli lokesh", 30000, true);
			CurrentAcc n= new MMCurrentAcc(964202412,"Ayesh", 35000,10000);
			System.out.println("Saving Account: ");
			p.withdraw(p.getAccBal());
			System.out.println();
			System.out.println("Current Account: ");
			n.withdraw(n.getAccBal());
			
			System.out.println(p);
			System.out.println(n);
			
			
			

	}

}
