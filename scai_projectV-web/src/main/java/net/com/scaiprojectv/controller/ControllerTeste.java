/**
 * 
 */
package net.com.scaiprojectv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Comment(s): 
 * 
 * @author Paulo Garcia
 * @Feb 7, 2014
 * @11:36:30 PM
 *
 * Scai Project_V®
 *
 * Developed by Paulo Garcia
 */
@Controller
@RequestMapping(value = "/teste")
public class ControllerTeste{

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView view = new ModelAndView("index");
		System.out.println("Entrou na bagaçaaaa!!!");
		return view;
	}
	
}
