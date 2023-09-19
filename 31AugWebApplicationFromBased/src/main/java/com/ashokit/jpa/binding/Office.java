package com.ashokit.jpa.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="OFFICE_MASTER_TBL")
public class Office {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empId;
	private String empName;
	private String empDC;
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
	public String getEmpDC() {
		return empDC;
	}
	public void setEmpDC(String empDC) {
		this.empDC = empDC;
	}
	
	
	@Override
	public String toString() {
		return "Office [empId=" + empId + ", empName=" + empName + ", empDC=" + empDC + "]";
	}
	
	

}
