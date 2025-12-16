package com.user.logistic.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.logistic.dao.EmployeeDao;


/**
 * Servlet implementation class EmployeeLoginServlet
 */
@WebServlet("/EmployeeLoginServlet")
public class EmployeeLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String resEmployeeId = request.getParameter("employeeId");
        String resEmployeePassword = request.getParameter("employeePassword");

        EmployeeDao eDao = new EmployeeDao();
        boolean isValidUser = eDao.validateUser(resEmployeeId, resEmployeePassword, request, response);

        if (isValidUser) {
          
            request.setAttribute("loginSuccess", true);
            RequestDispatcher rd = request.getRequestDispatcher("EmployeeHome.jsp");
            rd.forward(request, response);
        } else {
            request.setAttribute("loginFailed", true);
            RequestDispatcher rd = request.getRequestDispatcher("EmployeeLogin.jsp");
            rd.forward(request, response);
        }
    }

}








