/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filters;

import entity.User;
import java.io.IOException;
import javax.ejb.EJB;
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
import session.UserRolesFacade;
/**
 *
 * @author Melnikov
 */
@WebFilter(filterName = "SecureFilter", dispatcherTypes = {DispatcherType.FORWARD},  urlPatterns = {"/*"})
public class SecureFilter implements Filter {
    @EJB 
    private UserRolesFacade userRolesFacade;

    public SecureFilter() {
    }    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)request;
        String topRoleCurrnetUser=null;
        HttpSession session = httpRequest.getSession(false);
        if(session == null){
            httpRequest.setAttribute("topRoleCurrnetUser", topRoleCurrnetUser);
            chain.doFilter(request, response);
            return;
        }
        User user = (User) session.getAttribute("user");
        if(user == null){
            httpRequest.setAttribute("topRoleCurrnetUser", topRoleCurrnetUser);
            chain.doFilter(request, response);
            return;
        }
        topRoleCurrnetUser = userRolesFacade.getTopRoleName(user);
        if(topRoleCurrnetUser == null){
            httpRequest.setAttribute("topRoleCurrnetUser", topRoleCurrnetUser);
            chain.doFilter(request, response);
            return;
        }
        request.setAttribute("topRoleCurrnetUser", topRoleCurrnetUser);
        chain.doFilter(request, response);
    }
    @Override
    public void init(FilterConfig filterConfig) {        
    }
    @Override
    public void destroy() {
    }
}
