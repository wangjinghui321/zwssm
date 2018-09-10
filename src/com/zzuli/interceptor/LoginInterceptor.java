package com.zzuli.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
			//获取请求的url
		String url = request.getRequestURI();
		int x = url.indexOf("login.action");
		if(x>0){
			return true;
		}
		//判断是否登录
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		if(username!=null){
			return true;
		}
		
		//转发到登录页面
		//request.getRequestDispatcher("/login.jsp").forward(request, response);
		response.sendRedirect("login.jsp");
		return false;
	}

}
