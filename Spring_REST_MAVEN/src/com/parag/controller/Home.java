package com.parag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//call restapi controller
@Controller
public class Home {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("hello","Hi Parag ...");
		return "index";
	}

	@RequestMapping(value = "/clickme",method = RequestMethod.GET)
	public String clickMe(Model model){
		model.addAttribute("hello","Hi Parag  this is second page...");
		return "clickme";
	}

/*    //This will load automatically and this is index page controller
    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET,headers="Accept=application/json")
    public List<ModelData> list(){
	List<ModelData> list = new ArrayList<>();
	ModelData m = new ModelData();
	m.setName("Parag");
	m.setDetails("Hello, How are you?!!");
	m.setDescription("This is your example");
	list.add(m);
	return list;
    }*/
    
}
