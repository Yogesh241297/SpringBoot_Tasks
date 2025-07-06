package com.pvl.SpringBoot_with_Controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/W3school")
public class MyController {
	
	
	@RequestMapping(value="/html" , method= RequestMethod.GET)
	public String  firstApi() { 
		return "HTML stands for hypertext markup language";
	}
		
	@PostMapping ("/css")
		public String  secondtApi() { 
			return "css stands for cacading style sheett"; 
		
	}
			@PutMapping ("/javascript")
				public String  thirdApi() { 
					return "js stands for java script ";		
		
}
			@DeleteMapping ("/python")
			public String  fourthApi() { 
				return " python is powerful language";		
			}


}
