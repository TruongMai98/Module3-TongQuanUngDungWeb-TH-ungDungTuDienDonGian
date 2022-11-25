package com.example.simple_dictionary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServlet", value = "/456")
public class TranslationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Map<String, String> dictionary = new HashMap<>();
//        dictionary.put("hello", "Xin chào");
//        dictionary.put("how", "Thế nào");
//        dictionary.put("book", "Quyển vở");
//        dictionary.put("computer", "Máy tính");
//
//        String search = request.getParameter("txtSearch");
//
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//
//        String result = dictionary.get(search);
//        if (result != null) {
//            writer.println("word" + search + "\n");
//            writer.println("result" + result + "\n");
//        } else {
//            writer.println("khong tim thay");
//        }
//
//        writer.println("</html>");
//    }
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        String search = request.getParameter("txtSearch");

        PrintWriter writer = response.getWriter();

        writer.println("<head>");
        writer.println("<meta charset=\"UTF-8\">");
        writer.println("</head>");

        writer.println("<html>");
        writer.println("<body>");


        String result = dictionary.get(search);
        if(result != null){
            writer.println("Word: " + search);
            writer.println("<br>");
            writer.println("<p>" + "Result: " + result + "</p>");
        } else {
            writer.println("Not found");
        }
        writer.println("</body>");
        writer.println("</html>");
    }
}
