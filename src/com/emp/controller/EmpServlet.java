package com.emp.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.EmpService;
import com.emp.model.EmpVO;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	res.setContentType("text/html ; charset=UTF-8");
    	req.setCharacterEncoding("UTF-8");
    	
    	List<String> errorMsgs = new LinkedList<String>();//¸Ë¨ú¿ù»~°T®§
    	req.setAttribute("errorMsgs", errorMsgs);
    	
    	String action = req.getParameter("action");
    	
    	if("insertEmp".equals(action)){
    		
    		String ename = req.getParameter("ename");
    		String euser = req.getParameter("euser");
    		String password = req.getParameter("password");
    		String email = req.getParameter("email");
    		
    		EmpVO empVO = new EmpVO();
    		empVO.setEname(ename);
    		empVO.setEuser(euser);
    		empVO.setPassword(password);
    		empVO.setEmail(email);
    		
    		EmpService service = new EmpService();
    		service.insertEmp(empVO);
    		
    	}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(req, res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(req, res);
	}

}
