package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.offcn.po.Mobile;
import com.offcn.service.MobileService;

@Controller
public class MobileController {
	
	@Autowired
	MobileService ms;

	@RequestMapping("getByNum")
	@ResponseBody
	public Mobile getByNum(Model model,String mobileNumber){
		
		  Mobile mobile = ms.getByMNumber(mobileNumber);
		  
		  model.addAttribute("mobile", mobile);
		  
		return mobile;
	}
	
}
