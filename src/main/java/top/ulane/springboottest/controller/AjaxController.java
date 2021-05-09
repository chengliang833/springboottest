package top.ulane.springboottest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.ulane.springboottest.model.Mytable;
import top.ulane.springboottest.service.MytableService;
import top.ulane.springboottest.vo.ResponseData;

@RestController
public class AjaxController {
	
	@Autowired
	private MytableService mytableService;
	
	@RequestMapping("/ajaxtest")
	public String ajaxtest() {
		return "hello";
	}
	
	@RequestMapping("/testdao")
	public ResponseData<Mytable> testdao(){
		//由jackson-databind转换为string
		return new ResponseData<Mytable>(mytableService.selectByPrimaryKey(1));
	}

	@RequestMapping("/commonBeanProxy")
	public ResponseData commonBeanProxy(){
		return new ResponseData("");
	}
	
}
