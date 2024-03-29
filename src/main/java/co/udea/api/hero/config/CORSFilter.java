/*
 * Created on 27 feb 2018 ( Time 11:41:54 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package co.udea.api.hero.config;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Filter for Cross-Origin Resource Sharing.
 *
 */
@Component
public class CORSFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with, origin, content-type, accept");
		response.setHeader("Access-Control-Max-Age", "1800");
		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

}