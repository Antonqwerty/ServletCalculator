import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AntonServlet extends HttpServlet {
    public void init(ServletConfig config) {
        System.out.println("Servlet is being initialized");
    }
    String type = "+";
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int x = Integer.parseInt(request.getParameter("x"));
        int y = Integer.parseInt(request.getParameter("y"));
        double result = 0;
        type = request.getParameter("type");
        if ("+".equals(type)) {
            result = x + y;

        } else if ("-".equals(type)) {
            result = x - y;

        } else if ("*".equals(type)) {
            result = x * y;

        } else if ("/".equals(type)) {
            result = x / y;

        }

        PrintWriter writer = response.getWriter();
        writer.println("<html>Result = " + result + "</html>");
        writer.flush();

    }

    public void destroy() {
        System.out.println("Servlet is being destroyed");
    }
}