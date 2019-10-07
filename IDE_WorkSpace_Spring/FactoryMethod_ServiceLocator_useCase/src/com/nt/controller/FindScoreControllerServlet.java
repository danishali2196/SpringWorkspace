package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.FindScoreService;


public class FindScoreControllerServlet extends HttpServlet {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		int mid;
		FindScoreService service=null;
		String scoreCard=null;
		RequestDispatcher rd=null;
		
		//read matchid
		mid=Integer.parseInt(req.getParameter("matchId"));
		
		service=ctx.getBean("scoreService",FindScoreService.class);
		
		scoreCard=service.getScore(mid);
		
		req.setAttribute("scoreCard",scoreCard);
		
		rd=req.getRequestDispatcher("/view_score.jsp");
		rd.forward(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		doGet(req, res);
	}

}
