package com.kexin.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    // method: 要执行的目标对象的方法
    // args: 被调用的方法的参数
    // target: 目标对象
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println( target.getClass().getName() + "的" + method.getName() + "方法被执行了");
    }
}
