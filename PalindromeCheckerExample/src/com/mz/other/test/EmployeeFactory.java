package com.mz.other.test;

public interface EmployeeFactory {
	Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
	//Employee makeEmployee(String name) throws Exception;
}
