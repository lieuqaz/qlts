package com.qlts_jvw.controller.login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qlts_jvw.model.AccountModel;
import com.qlts_jvw.service.IAuthService;
import com.qlts_jvw.utils.FormUtil;
import com.qlts_jvw.utils.SessionUtil;

import java.io.IOException;
import java.util.ResourceBundle;

@WebServlet(urlPatterns = { "/dang-nhap" })
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 2686801510274002166L;

//	ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
//	private IAuthService authService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String action = request.getParameter("action");
//		if (action != null && action.equals("login")) {
//			String alert = request.getParameter("alert");
//			String message = request.getParameter("message");
//			if (message != null && alert != null) {
//				request.setAttribute("message", resourceBundle.getString(message));
//				request.setAttribute("alert", alert);
//			}
//			RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
//			rd.forward(request, response);
//		} else if (action != null && action.equals("logout")) {
//			SessionUtil.getInstance().removeValue(request, "USERMODEL");
//			response.sendRedirect(request.getContextPath()+"/dang-nhap");
//		} else {
//			RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
//			rd.forward(request, response);
//		}
		RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String action = request.getParameter("action");
//		if (action != null && action.equals("login")) {
//			AccountModel model = FormUtil.toModel(AccountModel.class, request);
//			model = authService.login(model.getUsername(), model.getPassword());
//			if (model != null) {
//				SessionUtil.getInstance().putValue(request, "USERMODEL", model);
//				response.sendRedirect(request.getContextPath()+"/admin-home");
//			} else {
//				response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login&message=username_password_invalid&alert=danger");
//			}
//		}
	}
}
