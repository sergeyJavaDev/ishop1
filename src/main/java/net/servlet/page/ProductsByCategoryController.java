package net.servlet.page;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.servlet.AbstractController;
import net.util.RoutingUtils;


@WebServlet("/products/*")
public class ProductsByCategoryController extends AbstractController {
	private static final long serialVersionUID = 1015660808630879774L;
	private static final int SUBSTRING_INDEX = "/products".length();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String categoryUrl = req.getRequestURI().substring(SUBSTRING_INDEX);
		RoutingUtils.forwardToPage("products.jsp", req, resp);
	}
}
