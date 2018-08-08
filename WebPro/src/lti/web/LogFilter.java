package lti.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogFilter implements Filter {

    public LogFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here to intercept request
		System.out.println("Ip Address: "+request.getRemoteAddr());
		System.out.println("Time: "+ new Date());
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		// place your code here to intercept response
		PrintWriter out = response.getWriter();
		out.println("<hr><p align=center>&copy; Copyright 2020 LTI </p>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
