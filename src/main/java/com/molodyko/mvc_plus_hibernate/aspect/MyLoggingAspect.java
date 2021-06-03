package com.molodyko.mvc_plus_hibernate.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.molodyko.mvc_plus_hibernate.* .*(..))")
    public Object logAllMethodsAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        MethodSignature methodSignature =  (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();

        System.out.printf("method %s start work\n",methodName);

        Object result =  proceedingJoinPoint.proceed();
        System.out.printf("method %s end work\n",methodName);
        return result;
    }
}
