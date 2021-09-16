//HtmlServlet.java
package com.nt.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class HtmlServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		res.setHeader("refresh","10");
		PrintWriter pw=res.getWriter();
		pw.println("<h1 style='color:blue' align='center'>India Olampics Medals List</h1>");
		pw.println("<table border='1' align='center' style='border:2px solid blue' border width='400px'>");
		pw.println("<tr style='color:red'><th>Player name </th> <th>Medal</th> <th>categeory</th> </tr>");
		pw.println("<tr><td>Neeraj chopra</td> <td>Gold</td> <td>Javaline throw</td> </tr>");
		pw.println("<tr><td>Meerabhai</td> <td>Silver</td> <td>weight lift</td> </tr>");
		pw.println("<tr><td>Ravi Kumur</td> <td>Silver</td> <td>Wresling</td> </tr>");
		pw.println("<tr><td>PV Sindhu</td> <td>Bronze</td> <td>Batminton</td> </tr>");
		pw.println("<tr><td>Lovlina</td> <td>Bronze</td> <td>Boxing</td> </tr>");
		pw.println("<tr><td>Mens Hockey</td> <td>Bronze</td> <td>Hockey</td> </tr>");
		pw.println("<tr><td>Bajrang</td> <td>Bronze</td> <td>Wresling</td> </tr>");
		pw.println("<tr><td>PT</td> <td>Dis</td> <td>Running</td> </tr>");
		pw.println("</table>");
		Date d=new Date();
		pw.println("<h1>Date and time is::"+d+"</h1>");
		pw.println("<h1>req object class name is::"+req.getClass()+"</h1>");
		pw.println("<h1>res object class name is::"+res.getClass()+"</h1>");
		pw.close();
	}


}
