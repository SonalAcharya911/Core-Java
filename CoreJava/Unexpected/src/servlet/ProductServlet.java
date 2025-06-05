package servlet;

import dto.ProductDto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("productName");
        String prodID=req.getParameter("productID");
        String category=req.getParameter("category");
        String amount=req.getParameter("price");
        String prodQuantity=req.getParameter("quantity");

        Integer productID=Integer.parseInt(prodID);
        Double price=Double.parseDouble(amount);
        Integer quantity=Integer.parseInt(prodQuantity);

        ProductDto productDto=new ProductDto();



    }
}
