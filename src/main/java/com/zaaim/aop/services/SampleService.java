package com.zaaim.aop.services;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

   public String performTask() {
      // Simulate some business logic
      return "Task performed!";
   }
}

