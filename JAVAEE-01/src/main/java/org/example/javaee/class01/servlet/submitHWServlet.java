package org.example.javaee.class01.servlet;

import org.example.javaee.class01.jdbc.StudentHomeworkJdbc;
import org.example.javaee.class01.model.submitHWModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//学生提交作业
@WebServlet("/add")
public class submitHWServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        submitHWModel sh = new submitHWModel();
        /**
         * 赋值
         */
        sh.setStudentId(Integer.getInteger(req.getParameter("studentId")));
        StudentHomeworkJdbc.submitHW(sh);

        resp.sendRedirect("list");
    }
}