package com.hellozjf.java.study.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping(value = "/test.do", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String test() {
		return "test";
	}
}
