package com.mz.other.test;

public class HourlyEmployee extends Employee {

	public HourlyEmployee(EmployeeRecord r) {
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
