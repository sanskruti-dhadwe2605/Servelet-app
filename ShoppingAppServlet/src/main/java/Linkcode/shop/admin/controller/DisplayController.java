package Linkcode.shop.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Linkcode.shop.admin.daoimpl.ProductServiceImpl;
import Linkcode.shop.admin.model.Product;
import Linkcode.shop.admin.service.ProductService;

/**
 * Servlet implementation class DisplayController
 */
@WebServlet("/DisplayController")
public class DisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ProductService proddao=new ProductServiceImpl();
		List<Product> lstprod=proddao.getAllProduct();
		if(lstprod!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("prodlst",lstprod);
			
		}
		response.sendRedirect("clienthome.jsp");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
