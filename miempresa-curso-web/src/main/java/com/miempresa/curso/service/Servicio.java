package com.miempresa.curso.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servicio
 */
@WebServlet("/Servicio")
public class Servicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

    /**
     * Default constructor. 
     */
    public Servicio() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		PrintWriter writer = response.getWriter();
		
		String nameThreadCurrent = Thread.currentThread().getName();
		String nameThreadLocal = WebSessionContext.get();
		
		writer.append(" nameThreadLocal   --> " + nameThreadLocal + "\n");
		writer.append(" nameThreadCurrent --> " + nameThreadCurrent + "\n");
		writer.append(" *********************************************\n ");
		writer.append(" ***********    willysystems *****************\n ");
		writer.append(" ********************************************* ");
		
		
		WebSessionContext.set(nameThreadCurrent);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
