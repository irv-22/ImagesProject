/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import za.ac.tut.ejb.bl.ImagetableFacadeLocal;
import za.ac.tut.entites.Imagetable;

/**
 *
 * @author hp
 */
public class StoreServlet extends HttpServlet {

    @EJB
    private ImagetableFacadeLocal imagetableFacade;
    
   

    public static final String UPLOAD_DIR = "images";
    public String dbFileName = "";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        int id = Integer.parseInt(request.getParameter("imgId"));
        String name = request.getParameter("imgName");
        
        Part part;
        part = request.getPart("imagepath");
        String imagepath =part.toString();
        Imagetable img=new Imagetable(id);
        img.setImagename(name);
        img.setImagepath(imagepath);
        imagetableFacade.create(img);
        
        request.setAttribute("path", imagepath);
        RequestDispatcher disp=request.getRequestDispatcher("imageStored.jsp");
        disp.forward(request, response);
    }

}
