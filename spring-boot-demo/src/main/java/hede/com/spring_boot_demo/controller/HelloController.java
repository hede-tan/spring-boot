package hede.com.spring_boot_demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * **************************************** 
 * 描述:
 * (c) 2016 Company: 北京连心医疗科技有限公司
 * @author tan.lin
 * @version 1.0 2017年8月3日
 *****************************************
 */
@Controller
public class HelloController {

    // 从 application.properties 中读取配置，如取不到默认值为Hello
    @Value("${application.hello:Hello}")
    private String hello;


    @GetMapping("/hello")
    @ResponseBody
    public String hello(String str) {
    	return str;
    }
    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String, Object> map) {
        map.put("hello", hello);
        return "helloJsp";

    }
    
    @RequestMapping("/page1")
    public ModelAndView page1(){
        // 页面位置 /WEB-INF/jsp/helloJsp.jsp
        ModelAndView mav = new ModelAndView("/helloJsp");
        mav.addObject("hello", hello);
        return mav;
    }

}