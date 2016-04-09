package com.mz.other.test;

public abstract class Employee {

	public abstract boolean isPayDay();
	public abstract Money calculatePayDay();
	public abstract void deliverPay(Money pay);
}
