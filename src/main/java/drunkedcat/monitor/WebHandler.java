package drunkedcat.monitor;


import drunkedcat.common.Defaults;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Copyright (C) 2006-2017  AdMaster Co.Ltd.
 * All right reserved.
 *
 * @author: whitelilis@gmail.com on 18/8/10
 */
public class WebHandler extends AbstractHandler {

    public static void main( String[] args ) throws Exception
    {
        Defaults defaults = new Defaults();
        Server server = new Server(defaults.getInt("server.port", 8080));
        server.setHandler(new WebHandler());

        server.start();
        server.join();
    }

    @Override
    public void handle(String s, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
        httpServletResponse.setContentType("text/html; charset=utf-8");
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);


        // Write back response
        PrintWriter writer = httpServletResponse.getWriter();
        writer.println(String.format("<center><h1>GroupID:  all : </h1></center>"));
        writer.println(String.format("<center><h1>Never report : <font color=\"e91e6f\">33</font>; delayed : <font color=\"ffe4b5\">55</font> </h1></center>"));
        writer.println("<center><table border=\"1\" cellspacing=\"0\" cellpadding=\"0\">");
        writer.println("<tr><td>ip</td><td>name</td><td>lastheartbeat</td></tr>");


        writer.println("</table></center>");
        writer.println();
        writer.flush();
        writer.close();

        // Inform jetty that this request has now been handled
        request.setHandled(true);
    }
}
