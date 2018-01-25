package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;

@Controller
@RequestMapping("test")
public class TestController
{
    private static final Log logs = LogFactory.getLog(TestController.class);
    
    @RequestMapping("toPage.do")
    public ModelAndView toTestPage()
    {
        ModelAndView view = new ModelAndView("test");
        logs.info("日志----------");
        view.addObject("aaa", "2222");
        return view;
    }
}
