package com.xworkz.recipe.servlet;

import com.xworkz.recipe.dto.RecipeDto;
import com.xworkz.recipe.repository.RecipeRepository;
import com.xworkz.recipe.repository.RecipeRepositoryImpl;
import com.xworkz.recipe.service.RecipeService;
import com.xworkz.recipe.service.RecipeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getRecipe")
public class RecipeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String ing1=req.getParameter("ing1");
        String ing2=req.getParameter("ing2");
        String ing3=req.getParameter("ing3");
        String ing4=req.getParameter("ing4");
        String ing5=req.getParameter("ing5");

        RecipeDto recipeDto=new RecipeDto();
        recipeDto.setRecipeName(name);
        recipeDto.setIng1(ing1);
        recipeDto.setIng2(ing2);
        recipeDto.setIng3(ing3);
        recipeDto.setIng4(ing4);
        recipeDto.setIng5(ing5);

        RecipeService recipeService=new RecipeServiceImpl();
        boolean saved=recipeService.save(recipeDto);
        if(saved){
            System.out.println("data is valid");
            RequestDispatcher requestDispatcher= req.getRequestDispatcher("recipeSuccess.jsp");
            req.setAttribute("recipeDto",recipeDto);
            requestDispatcher.forward(req,resp);
        }
        else{
            System.out.println("data id invalid");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("recipe.jsp");
            req.setAttribute("message","saving failed");
            requestDispatcher.forward(req,resp);
        }

        RecipeRepository recipeRepository=new RecipeRepositoryImpl();




    }
}
