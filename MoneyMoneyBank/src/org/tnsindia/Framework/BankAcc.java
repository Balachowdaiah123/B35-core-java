package org.tnsindia.Framework;

public abstract class BankAcc {
	
	private int accNo;
	private String accNum;
	private float accBal;
	
	
	
	
	public BankAcc(int accNo, String accNum, float accBal) {
		super();
		this.accNo = accNo;
		this.accNum = accNum;
		this.accBal = accBal;
		
	}
	//abstract method
	abstract public void bookProduct(float charges);
	
	
    //non-abstract method
	public void items(float charges)
	
	{
		System.out.println(charges);
	}
	
	
	//getters and setters
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public float getAccBal() {
		return accBal;
	}
	
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNum=" + accNum + ", accBal=" + accBal + "]";
	}
	
	
	
}
