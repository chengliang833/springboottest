package top.ulane.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello1.do")
	public String hello1() {
		Integer.parseInt("124");
		return "hello";
	}

	@RequestMapping("/hello2.do")
	public String hello2() {
		String str = "abcd";
		str.charAt(2);
		return "hello";
	}

}
