package com.csi.dao;

import com.csi.model.Employee;

public interface EmployeeDao {

	public void signUp(Employee employee);

	public boolean signIn(String empEmailId, String empPassword);

}
