package servlet;

import beans.Customer;
import utils.DBUtils;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.List;
import java.util.Set;

@javax.servlet.annotation.WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        Set<Customer> customers = DBUtils.getCustomers();
        request.setAttribute("customers", customers);

        RequestDispatcher dispatcher = request.getRequestDispatcher("customers.jsp");
        dispatcher.forward(request, response);
    }
}
