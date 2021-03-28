package com.market.servicemarket.util;

import com.market.servicemarket.request.BaseRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component
@Aspect
public class AopUtil {

    @Around("myPointcut()")
    public Object logExecutionTime(ProceedingJoinPoint pjb) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = pjb.proceed();
        Object[] objs = pjb.getArgs();
        //System.out.println(""+pjb.getSignature().getName()+"   method ="+objs.getClass().getName());
        long executionTime = System.currentTimeMillis() - start;
        System.out.println(" ExecutionTime "+executionTime);
        return proceed;
    }



    @Pointcut(value="execution(* com.market.servicemarket.controller.*.*(..))")
    public void myPointcut() {}


}
