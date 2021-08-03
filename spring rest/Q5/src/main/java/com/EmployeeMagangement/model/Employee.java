package com.EmployeeMagangement.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.springframework.lang.NonNull;

@Entity
@Table (name = "employee")
public class Employee {

	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeID;
	
	@Column(name="emp_name")
	private String EmployeeName;
	
	@Column(name="dept_name")
	private String DeptName;
	
	@Column(name="desig_name")
	private String DesigName;
	
	@Column(name="salary")
	private int salary;
	
	public Employee(){
		
	}

	public Employee(int employeeID, String employeeName, String deptName, String desigName, int salary) {
		super();
		this.employeeID = employeeID;
		EmployeeName = employeeName;
		DeptName = deptName;
		DesigName = desigName;
		this.salary = salary;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	public String getDesigName() {
		return DesigName;
	}

	public void setDesigName(String desigName) {
		DesigName = desigName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalaryName(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", EmployeeName=" + EmployeeName + ", DeptName=" + DeptName
				+ ", DesigName=" + DesigName + ", salaryName=" + salary + "]";
	}
	
	
	
}
