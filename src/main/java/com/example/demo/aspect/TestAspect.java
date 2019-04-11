package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author xuyyuan
 * @Date 2019-03-30 11:16
 **/
//@Aspect
@Component
public class TestAspect {

//    @Pointcut("execution(public * com.example.demo.service.CyclicDependencyService.sameClassMethod(..))")
//    private void testPointcut() {}
//
//    @AfterReturning("testPointcut()")
//    public void after(JoinPoint point) {
//        System.out.println("在" + point.getSignature() + "之后干点事情");
//    }

}
