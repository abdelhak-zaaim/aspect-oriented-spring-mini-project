package com.zaaim.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

   @Around("execution(* com.zaaim.aop.services.*.*(..))")
   public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
      long start = System.currentTimeMillis();
      Object proceed = joinPoint.proceed();
      long executionTime = System.currentTimeMillis() - start;

      System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
      return proceed;
   }


   // This method is used to log the execution time of the methods that are annotated with @LogExecutionTime
   @Around("@annotation(com.zaaim.aop.anotations.LogExecutionTime)")
   public Object logExecutionTimeForMethods(ProceedingJoinPoint joinPoint) throws Throwable {
      long start = System.currentTimeMillis();

      Object proceed = joinPoint.proceed();

      long executionTime = System.currentTimeMillis() - start;
      System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");

      return proceed;
   }
}
