package com.egg.controller.servlet;

import com.alibaba.fastjson.JSON;
import com.egg.controller.vo.Msg;
import com.egg.controller.vo.Res;
import com.egg.dao.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "IsUsingServlet")
public class IsUsingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getParameter("username");
        User user = null;
        if (user==null){
            user=new User();
        }
        Res<User> res = Res.success(Msg.SUCCESS_LOGIN,user);
        PrintWriter printWriter = response.getWriter();
        String json = JSON.toJSONString(res);
        printWriter.println(json);
        printWriter.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
