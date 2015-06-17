package com.test.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogTestFile extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	private static final long serialVersionUID = 1L;
	static Logger log = Logger.getLogger(LogTestFile.class);
	private static Log log1 = LogFactory.getLog(LogTestFile.class);

	public LogTestFile() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Howdy<br/>");
		log.debug("debug message");
		log.info("info message");
		log.warn("warn message");
		log.error("error message");
		log.fatal("fatal message");
		
		out.println("Howdy1<br/>");
		log1.debug("debug message");
		log1.info("info message");
		log1.warn("warn message");
		log1.error("error message");
		log1.fatal("fatal message");
		System.out.println("Test for master branch commit1");
	}

}