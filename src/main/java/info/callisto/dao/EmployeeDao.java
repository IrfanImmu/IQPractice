package info.callisto.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import info.callisto.entity.Employee;

@Repository
public class EmployeeDao extends JdbcDaoSupport {
 
	@Autowired
	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		this.setJdbcTemplate(jdbcTemplate);
	}
	
	public int saveEmployee(Employee employee) {
		String sql="insert into employee values(?,?,?)";
		return getJdbcTemplate().update(sql, employee.getEno(), employee.getName(), employee.getSalary());
		
	}
}
