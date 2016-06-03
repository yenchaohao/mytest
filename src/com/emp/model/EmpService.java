package com.emp.model;

public class EmpService {
	private EmpDAO_interface dao;
	
	public EmpService(){
		dao = new EmpDAO();
	}
	
	public EmpVO insertEmp(EmpVO empVO){
		dao.insert(empVO);
		
		return empVO;
		
	}
}
