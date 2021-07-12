package com.dao;

import java.util.List;

import com.model.Employee;
import com.model.UserModel;

public interface EmpDao {

	public int save(Employee emp);

	public List<Employee> getEmployees();

	public Employee getEmpById(int id);

	public void update(Employee emp);

	public void delete(int id);

	Employee validUser(UserModel user);

	public List<Employee> getPagination(int pageId, int total);


}
