package co.grandcircus.Lab21point5milage;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MilageController {
	
	@RequestMapping("/")  
	public ModelAndView showIndex() {
		return new ModelAndView("index"); 
	}
	
	@RequestMapping("/milage-form")
	public ModelAndView showMilageForm() {
		return new ModelAndView("milage-form");
	}
	
	@RequestMapping("/milage-result")
	public ModelAndView showMilageResult(
			@RequestParam("mpg") int num1,
			@RequestParam("gallons") int num2) {
		
		int result = num1 * num2;
		
		ModelAndView mav = new ModelAndView("milage-result");
		mav.addObject("mpg", num1);
		mav.addObject("gallons", num2);
		mav.addObject("result", result);
		return mav;
	}
	
	@RequestMapping("/time-form")
	public ModelAndView showTimeForm() {
		return new ModelAndView("time-form");
	}
	
	@RequestMapping("/time-result")
	public ModelAndView showTimeResult(
			@RequestParam("miles") float num1,
			@RequestParam("speed") float num2) {
		
		float result = num1 / num2;
		
		ModelAndView mav = new ModelAndView("time-result");
		mav.addObject("miles", num1);
		mav.addObject("speed", num2);
		mav.addObject("result", result);
		return mav;
	}
	
	@RequestMapping("/addNumber-form")
	public ModelAndView showNumberForm() {
		return new ModelAndView("addNumber-form");
	}
	
	@RequestMapping("/addNumber-result")
	public ModelAndView showNumberResult(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2) {
		
		int result = num1 + num2;
		
		ModelAndView mav = new ModelAndView("addNumber-result");
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		return mav;
	}
	
	@RequestMapping("/divide-form")
	public ModelAndView showDivideForm() {
		return new ModelAndView("divide-form");
	}
	
	@RequestMapping("/divide-result")
	public ModelAndView showDivideResult(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2) {
		
		int result = num1 / num2;
		int result1 = num1 % num2;
		
		ModelAndView mav = new ModelAndView("divide-result");
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		mav.addObject("result1", result1);
		return mav;
	}
	
	@RequestMapping("/myMadlib-form")  
	public ModelAndView showmyMadlibForm() {
		return new ModelAndView("myMadlib-form");  
	}
	
	@RequestMapping("/myMadlib-story")
	public ModelAndView showmyMadlibStory( 
	@RequestParam("noun")String noun,
	@RequestParam("adj")String adj,
	@RequestParam("adv")String adv,
	@RequestParam("bodypart")String part,
	@RequestParam("verb")String verb,
	@RequestParam("color")String color){	
		ModelAndView mv = new ModelAndView("myMadlib-story");
		mv.addObject("noun", noun);
		mv.addObject("adj", adj);
	    mv.addObject("adv", adv);
		mv.addObject("bodypart", part);
		mv.addObject("color", color);
		mv.addObject("verb", verb);
		return mv;
	}
	
	@RequestMapping("/repeatWord-form")
	public ModelAndView showWordForm() {
		return new ModelAndView("repeatWord-form");
	}
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
