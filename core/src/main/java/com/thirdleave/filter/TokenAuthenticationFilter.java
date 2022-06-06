package com.thirdleave.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "TokenAuthenticationFilter", urlPatterns = "/*")
public class TokenAuthenticationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入Filter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开Filter");
    }

    @Override
    public void destroy() {

    }
}