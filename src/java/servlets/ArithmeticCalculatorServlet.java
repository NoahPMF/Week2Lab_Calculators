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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first_String = request.getParameter("first");
        String second_String = request.getParameter("second");
        String calc = request.getParameter("calc");

        //request.setAttribute("one", first_String);
        // request.setAttribute("two", first_String);
        if (first_String == null || first_String.equals("")
                || second_String == null || second_String.equals("")) {
            request.setAttribute("result", "please enter both values");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

        try {
            double first_dub = Double.parseDouble(first_String);
            double second_dub = Double.parseDouble(second_String);
            double total;

            switch (calc) {
                case "+":
                    total = first_dub + second_dub;
                    request.setAttribute("result", total);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                case "-":
                    total = first_dub - second_dub;
                    request.setAttribute("result", total);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                case "*":
                    total = first_dub * second_dub;
                    request.setAttribute("result", total);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                case "%":
                    total = first_dub / second_dub;
                    request.setAttribute("result", total);
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                    break;
                default:
                    break;
            }

        } catch (NumberFormatException e) {
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
    }

}
