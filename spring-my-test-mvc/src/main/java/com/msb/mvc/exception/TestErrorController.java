/**
 * zhuyanyoushu.com
 * Copyright (C) 2021-2023 All Rights Reserved.
 *
 * @author: 郑延康
 * @date: 2023-09-18 19:07
 */
package com.msb.mvc.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 *
 * @author zhengyankang
 * @version TestErrorController.java, v 0.1 2023-09-18 19:07
 */
@Controller
public class TestErrorController {

	@RequestMapping("/exception")
	public ModelAndView exception(ModelAndView modelAndView) throws ClassNotFoundException {
		modelAndView.setViewName("index");
		throw new ClassNotFoundException("class not found");
	}

	@RequestMapping("nullPointer")
	public ModelAndView nullPointer(ModelAndView modelAndView){
		modelAndView.setViewName("index");
		String str = null;
		str.length();
		return modelAndView;
	}

	@ExceptionHandler(RuntimeException.class)
	public ModelAndView error1(RuntimeException error, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("error");
		mav.addObject("msg", "Runtime error");
		return mav;
	}

	@ExceptionHandler()
	public ModelAndView error3(Exception error, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("error");
		mav.addObject("msg", "Exception error");
		return mav;
	}


    @ExceptionHandler(NullPointerException.class)
    public ModelAndView error3(ModelAndView mav) {
        mav.setViewName("error");
        mav.addObject("msg", "NullPointer error");
        return mav;
    }

}
