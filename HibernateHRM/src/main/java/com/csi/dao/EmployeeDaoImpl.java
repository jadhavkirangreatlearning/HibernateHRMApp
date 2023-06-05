package com.csi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.csi.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

	@Override
	public void signUp(Employee employee) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(employee);

		transaction.commit();
	}

	@Override
	public boolean signIn(String empEmailId, String empPassword) {
		// TODO Auto-generated method stub

		Session session = factory.openSession();

		List<Employee> employees = session.createQuery("from Employee").list();

		boolean flag = false;

		for (Employee employee : employees) {
			if (employee.getEmpEmailId().equals(empEmailId) && employee.getEmpPassword().equals(empPassword)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}
