package com.emp.model;

public class EmpVO implements java.io.Serializable{
	
	private String empid;
	private String ename;
	private String euser;
	private String password;
	private String email;
	private String status;
	
	public EmpVO(){}
	

	public EmpVO(String empid, String ename, String euser, String password,
			String email, String status) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.euser = euser;
		this.password = password;
		this.email = email;
		this.status = status;
	}


	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEuser() {
		return euser;
	}

	public void setEuser(String euser) {
		this.euser = euser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	


}
