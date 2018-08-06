package org.example;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServeletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
public class HelloServelet extends HttpServlet
{
protected void doGet(HttpServeletRequest request,HttpServeletResponse) throws ServletException,IOException
{
PrintWriter w=response.getWriter();
w.print("hello");
}
}
