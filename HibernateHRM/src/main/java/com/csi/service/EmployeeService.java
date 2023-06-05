package com.csi.service;

import com.csi.model.Employee;

public interface EmployeeService {

	public void signUp(Employee employee);

	public boolean signIn(String empEmailId, String empPassword);

}
