package com.fl.interceptor;


import com.fl.pojo.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String requestURI = httpServletRequest.getRequestURI();
        HttpSession session = httpServletRequest.getSession();
        UserInfo userinfo = (UserInfo)session.getAttribute("userinfo");
        System.out.println("URI:"+requestURI+"session:"+userinfo);
        if (userinfo!=null) {
            return true;
        }else if (requestURI.indexOf("loginCheck")!=-1||requestURI.indexOf("login.html")!=-1||requestURI.indexOf("reg.html")!=-1) {
            return true;
        }
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
