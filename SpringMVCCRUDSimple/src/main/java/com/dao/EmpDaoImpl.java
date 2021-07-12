package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Employee;
import com.model.UserModel;

public class EmpDaoImpl implements EmpDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Employee emp) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO employee(fName,lName,password,telephone,age,email) VALUES('" + emp.getfName() + "','"
				+ emp.getlName() + "','" + emp.getPassword() + "','" + emp.getTelephone() + "'," + emp.getAge() + ",'"
				+ emp.getEmail() + "') ";
		return template.update(sql);
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM employee";

		return template.query(sql, new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setfName(rs.getString(2));
				emp.setlName(rs.getString(3));
				emp.setPassword(rs.getString(4));
				emp.setTelephone(rs.getString(5));
				emp.setAge(rs.getInt(6));
				emp.setEmail(rs.getString(7));
				return emp;

			}
		});
	}

	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from employee where id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Employee>(Employee.class));

	}

	public void update(Employee emp) {
		// TODO Auto-generated method stub
		String sql = "UPDATE employee set fName = '" + emp.getfName() + "',lName='" + emp.getlName() + "',password='"
				+ emp.getPassword() + "',telephone='" + emp.getTelephone() + "',age=" + emp.getAge() + " , email = '"
				+ emp.getEmail() + "' where id=" + emp.getId() + "";

		template.update(sql);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE from employee where id=" + id + "";
		template.update(sql);

	}

	public Employee validUser(UserModel user) {
		String sql = "SELECT * FROM employee WHERE email='" + user.getMail() + "' AND  password='" + user.getPassword()
				+ "' AND id=" + user.getId() + "";
		List<Employee> lt = template.query(sql, new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setfName(rs.getString(2));
				emp.setlName(rs.getString(3));
				emp.setPassword(rs.getString(4));
				emp.setTelephone(rs.getString(5));
				emp.setAge(rs.getInt(6));
				emp.setEmail(rs.getString(7));
				return emp;

			}

		});

		return lt.size() > 0 ? lt.get(0) : null;
	}

	public List<Employee> getPagination(int pageId, int total) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM employee LIMIT " + total + " OFFSET " + pageId + "";
		List<Employee> list = template.query(sql, new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setfName(rs.getString(2));
				emp.setlName(rs.getString(3));
				emp.setPassword(rs.getString(4));
				emp.setTelephone(rs.getString(5));
				emp.setAge(rs.getInt(6));
				emp.setEmail(rs.getString(7));
				return emp;
			}
		});
		return list;
	}

}
