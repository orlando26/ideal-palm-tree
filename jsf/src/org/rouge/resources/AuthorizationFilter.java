package org.rouge.resources;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "AuthFilter", urlPatterns = { "*.xhtml" })
public class AuthorizationFilter implements Filter{
	public AuthorizationFilter() {
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest reqt = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		try {

			
			HttpSession ses = reqt.getSession(false);

			String reqURI = reqt.getRequestURI();
			if (ses != null && ses.getAttribute("user") != null && reqURI.indexOf("/index.xhtml") >= 0) resp.sendRedirect(reqt.getContextPath() + "/home.xhtml");
			if (reqURI.indexOf("/index.xhtml") >= 0
					|| (ses != null && ses.getAttribute("user") != null)
					|| reqURI.indexOf("/admin.xhtml") >= 0
					|| reqURI.indexOf("/error.xhtml") >= 0
					|| reqURI.contains("javax.faces.resource"))
				chain.doFilter(request, response);
			else
				resp.sendRedirect(reqt.getContextPath() + "/index.xhtml");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			resp.sendRedirect(reqt.getContextPath() + "/error.xhtml");
			System.out.println("Error 404");
		}
	}

	@Override
	public void destroy() {

	}
}
