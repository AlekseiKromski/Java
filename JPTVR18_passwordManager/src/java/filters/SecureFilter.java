/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filters;

import entity.User;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pupil
 */
@WebFilter(filterName = "SecureFilter",dispatcherTypes = {DispatcherType.FORWARD}, urlPatterns = {"/*"})
public class SecureFilter implements Filter {
    
   
    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
        
        
        HttpServletRequest hsr = (HttpServletRequest) request;
        HttpSession session = hsr.getSession(false);
        
        if(session == null){
            hsr.setAttribute("loginOn", false);
            chain.doFilter(request, response);
            return;
        }
        User user = (User) session.getAttribute("user");
        if(user == null){
            hsr.setAttribute("loginOn", false);
            chain.doFilter(request, response);
            return;
        }
        hsr.setAttribute("loginOn", true);

        //Передать на след. фильтр
        chain.doFilter(request, response);
    }

    public void init(FilterConfig filterConfig) {        
        
    }

    @Override
    public void destroy() {
        
    }

    
}
