package com.example.demo.hello;

import com.example.config.beetl.BeetlProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @ClassName Hi
 * @Description TODO
 * @Autor wushaohong
 * @Date 2019/3/1
 * @Version 1.0
 */
@Controller
@RequestMapping("hi")
public class Hi {
    private Logger logger=LoggerFactory.getLogger(this.getClass());

    @Resource
    private BeetlProperties beetlProperties;

    @RequestMapping("guy")

    public String hello(){
        logger.error("hello");
        System.out.println(beetlProperties);
        return "404";
    }
}
