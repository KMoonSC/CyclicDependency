package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author xuyyuan
 * @Date 2019-03-30 11:31
 **/
@Service
public class CyclicDependencyService {

    @Autowired
    private CyclicDependencyService cyclicDependencyService;

    public void test() {
        System.out.println("调用同类方法");
        cyclicDependencyService.sameClassMethod();
    }

    @Async
    public void sameClassMethod() {
        System.out.println("循环依赖中的异步方法");
        System.out.println("方法线程：" + Thread.currentThread().getName());
    }

}
