package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmpDTO;
import com.nt.service.EmpMgmtService;


@WebServlet("/controller")
public class MainController extends HttpServlet {
	ApplicationContext ctx=null;
	EmpMgmtService service=null;
	
	@Override
	public void init() throws ServletException {
		System.out.println("MainController.init()");
		ctx=new ClassPathXmlApplicationContext("/com/nt/cfgs/applicationContext.xml");
		service=ctx.getBean("empService", EmpMgmtService.class);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int no=Integer.parseInt(req.getParameter("no"));
		
		EmpDTO list;
		try {
			list = service.getEmpByID(no);
			
			req.setAttribute("result", list);
			
			RequestDispatcher rd=req.getRequestDispatcher("/result.jsp");
			rd.forward(req, res);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
