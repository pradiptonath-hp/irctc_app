package com.ashokit.binding;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="EmployeeTable")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empId;
	@NotEmpty(message = "Name is mandatory")
	@Size(min=3,max=6,message="Min 3 and Max 8 characters allowed")
	private String empName;
	@NotEmpty(message = "Department is mandatory")
	private String empDept;
	
	@NotNull(message = "Salary is mandatory")
    @DecimalMin(value = "10000.0", message = "Salary must be greater than or equal to 10000.0")
    @DecimalMax(value = "1000000.0", message = "Salary must be less than or equal to 1,000,000.0")
	private Double empSal;
	
	@Column(name = "is_deleted")
	 private boolean deleted;
	 
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
}
