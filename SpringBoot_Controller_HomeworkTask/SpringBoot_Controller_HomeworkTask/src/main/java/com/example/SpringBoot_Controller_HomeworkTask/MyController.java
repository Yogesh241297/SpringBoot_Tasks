package com.example.SpringBoot_Controller_HomeworkTask;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("https://www.vikasgroup.in")
public class MyController {
	@RequestMapping(value ="/railways",method= RequestMethod.GET)
	public String First_Api () {
		return(" This is the Redbus portal where you can book railways");
	}
	@RequestMapping(value ="/security",method= RequestMethod.GET)
	public String Second_Api () {
		return(" Security is most impotant thing ");
	}
	@RequestMapping(value ="/spring-boot-tutorial",method= RequestMethod.GET)
	public String Third_Api () {
		return(" Springboot is most used one");
	}
	
	@RequestMapping(value ="/reactjs-tutorial",method= RequestMethod.GET)
	public String Fourth_Api () {
		return(" Reactjs is also impotant one");
	}
	@RequestMapping(value ="/php-tutorial",method= RequestMethod.GET)
	public String Fifth_Api () {
		return(" PHP is most dedicated one");
	}
	@RequestMapping(value ="/mongodb-tutorial",method= RequestMethod.GET)
	public String Sixth_Api () {
		return(" mongodb is crysalclear");
	}
	@RequestMapping(value ="/two-wheeler.html",method= RequestMethod.GET)
	public String Seventh_Api () {
		return(" Its youtube era");
	}
	@RequestMapping(value ="/subscriptions",method= RequestMethod.GET)
	public String Eightth_Api () {
		return(" Its youtube subscrptions");
	}
	@GetMapping(value ="/customers")
	public String Ninth_Api () {
		return(" Custmer is god ");
	}
	
	@PostMapping(value ="/photo-gallery")
	public String Tenth_Api () {
		return(" Go to photoshoot");
	}
	@PostMapping(value ="/contact-us")
	public String Eleventh_Api () {
		return(" Connect and contact us");
	
	}
	@DeleteMapping(value ="/group-companies")
	public String Twelth_Api () {
		return(" Welcome to ths group");
	}
	@PutMapping(value ="/people/life-at-vikas")
	public String Thirteen_Api () {
		return(" Welcome to ths group");
	}
	@PutMapping(value ="/about-group")
	public String fourteen_Api () {
		return(" Welcome to PVL");
		
	}

	@PutMapping(value ="/current-openings")
	public String fifteen_Api () {
		return(" Welcome to PVL");
	}	
}
