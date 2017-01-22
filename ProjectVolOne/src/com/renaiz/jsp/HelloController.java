package com.renaiz.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("msg", "HelloWorld Message !");
		
		return model;
	}
}
