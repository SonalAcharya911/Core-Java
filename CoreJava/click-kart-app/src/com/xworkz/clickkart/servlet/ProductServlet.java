package com.xworkz.clickkart.servlet;

import com.xworkz.clickkart.dto.ProductDto;
import com.xworkz.clickkart.service.ProductService;
import com.xworkz.clickkart.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/submit",loadOnStartup = 1)
public class ProductServlet extends HttpServlet {

    public ProductServlet(){
        System.out.println("Product servlet created by tomcat");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name=req.getParameter("name");
        String type=req.getParameter("type");
        String costPrice=req.getParameter("costPrice");
        double cprice=0;
        if(costPrice!=null || costPrice==""){
            cprice=Double.parseDouble(costPrice);
        }
        String sellingPrice=req.getParameter("sellingPrice");
        double sprice=0;
        if(sellingPrice!=null || sellingPrice==""){
            sprice=Double.parseDouble(sellingPrice);
        }
        String mrp=req.getParameter("mrp");
        double mrPrice=0;
        if(mrp!=null || mrp==""){
            cprice=Double.parseDouble(mrp);
        }
        String description=req.getParameter("description");
        String brand=req.getParameter("brand");
        String quantity=req.getParameter("quantity");

        int quant=0;
        if(quantity!=null|| quantity ==""){
            quant=Integer.parseInt(quantity);
        }

        String color=req.getParameter("color");
        String weight=req.getParameter("weight");

        int prodWeight=0;
        if(weight!=null||weight==""){
            prodWeight=Integer.parseInt(weight);
        }
        String manufDate=req.getParameter("manufDate");
        String warranty=req.getParameter("warranty");
        String returnPolicy= req.getParameter("retpol");
        System.out.println(returnPolicy);

        ProductDto  productDto=new ProductDto();
        productDto.setName(name);
        productDto.setType(type);
        productDto.setCostPrice(cprice);
        productDto.setSellingPrice(sprice);
        productDto.setSellingPrice(mrPrice);
        productDto.setDescription(description);
        productDto.setBrand(brand);
        productDto.setQuantity(quant);
        productDto.setColor(color);
        productDto.setWeight(prodWeight);
        productDto.setWarranty(warranty);


        ProductService productService=new ProductServiceImpl();
        boolean saved=productService.save(productDto);
        if(saved){
            RequestDispatcher requestDispatcher= req.getRequestDispatcher("productSuccess.jsp");
            req.setAttribute("message","Saved Successfully");
            req.setAttribute("name",name);
            req.setAttribute("type",type);
            req.setAttribute("costp",cprice);
            req.setAttribute("sellp",sprice);
            req.setAttribute("mrp",mrPrice);
            req.setAttribute("description",description);
            req.setAttribute("brand",brand);
            req.setAttribute("quantity",quantity);
            req.setAttribute("color",color);
            req.setAttribute("productWeight",prodWeight);
            requestDispatcher.forward(req,resp);

        }
        else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("product.jsp");
            req.setAttribute("message", "Saving of Product Failed");
            requestDispatcher.forward(req,resp);
        }
    }
}
