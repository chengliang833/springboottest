package top.ulane.sprintboottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;

import top.ulane.springboottest.Application;
import top.ulane.springboottest.model.Mytable;
import top.ulane.springboottest.service.MytableService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UnitTest {
	
	@Autowired
	private MytableService mytableService;
	
	@Test
	public void test1(){
		Mytable m = mytableService.selectByPrimaryKey(1);
		System.out.println(JSON.toJSONString(m));
	}
	
	
	
	
	
	
	
}
