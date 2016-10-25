/**
 * 
 */
package com.travlesky.bkg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author Administrator
 *
 */
public class TestController implements Controller{

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public ModelAndView handleRequest(HttpServletRequest paramHttpServletRequest,
			HttpServletResponse paramHttpServletResponse) throws Exception {
		
		ModelAndView mv =new ModelAndView();
		mv.addObject("index", "»¶Ó­À´µ½SPRINGMVC ");
		mv.setViewName("/WEB-INF/jsps/index.jsp");
		return mv;
	}

}
