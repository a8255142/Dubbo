package com.jvm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.impl.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml"})
public class Jut
{
    
    private static final Log logs = LogFactory.getLog(Jut.class);
    
    @Autowired
    private TestService service;
    
    @Test
    public void test()
    {
        service.sayHello();
        logs.info("水电费第三方第三方");
    }
    
}
