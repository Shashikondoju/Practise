//HtmlServlet.java
package com.nt.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ExcelServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		PrintWriter pw=res.getWriter();
		//enable auto refresh
		res.setHeader("refresh","10");

		pw.println("<table border='1' align='center'>");
		pw.println("<tr><th>Player name </th> <th>Medal</th> <th>categeory</th> </tr>");
		pw.println("<tr><td>Neeraj chopra</td> <td>Gold</td> <td>Javaline throw</td> </tr>");
		pw.println("<tr><td>Meerabhai</td> <td>Silver</td> <td>weight lift</td> </tr>");
		pw.println("<tr><td>Ravi Kumur</td> <td>Silver</td> <td>Wresling</td> </tr>");
		pw.println("<tr><td>PV Sindhu</td> <td>Bronze</td> <td>Batminton</td> </tr>");
		pw.println("<tr><td>Lovlina</td> <td>Bronze</td> <td>Boxing</td> </tr>");
		pw.println("<tr><td>Mens Hockey</td> <td>Bronze</td> <td>Hockey</td> </tr>");
		pw.println("<tr><td>Bajrang</td> <td>Bronze</td> <td>Wresling</td> </tr>");
		pw.println("</table>");
		
		Date d=new Date();
		pw.println("<br> <h1>Date and time is: "+d+"</h1>");

		pw.close();
	}


}
