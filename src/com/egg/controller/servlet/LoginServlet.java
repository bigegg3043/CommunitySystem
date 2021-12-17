package com.egg.controller.servlet;

import com.alibaba.fastjson.JSON;
import com.egg.controller.vo.Conse;
import com.egg.controller.vo.Msg;
import com.egg.controller.vo.Res;
import com.egg.dao.pojo.User;
import com.egg.service.factory.ServiceFactory;
import com.egg.service.inter.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = ((UserService)ServiceFactory.getInter(Conse.USER)).login(request.getParameter("username"),request.getParameter("password"));
       request.setAttribute("user",user);
       request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
