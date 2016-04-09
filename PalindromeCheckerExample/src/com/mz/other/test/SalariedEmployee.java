package com.mz.other.test;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(EmployeeRecord r) {
	}

	@Override
	public boolean isPayDay() {
		return false;
	}

	@Override
	public Money calculatePayDay() {
		return null;
	}

	@Override
	public void deliverPay(Money pay) {

	}

}
