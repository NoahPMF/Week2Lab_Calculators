/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 601354
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String age_String = request.getParameter("age");

        if (age_String == null || age_String.equals("")) {
            request.setAttribute("message", "please enter a value");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }

        try {
            int age_Int = Integer.parseInt(age_String);
            int new_Age = age_Int +1;
            request.setAttribute("message", "on your next birthday you will be " + new_Age);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

        } catch (NumberFormatException e) {
            request.setAttribute("message", "please enter a number");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }

    }

}
