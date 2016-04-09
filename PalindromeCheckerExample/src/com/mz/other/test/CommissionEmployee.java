package com.mz.other.test;

public class CommissionEmployee extends Employee {

	public CommissionEmployee(EmployeeRecord r) {
	}

	@Override
	public boolean isPayDay() {
		return false;
	}

	@Override
	public void deliverPay(Money pay) {
		
	}

	@Override
	public Money calculatePayDay() {
		return null;
	}
}
