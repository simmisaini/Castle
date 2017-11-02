package com.aeq.test;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CastleTestRunner {

   public static void main(String[] args) {
	   Result result = JUnitCore.runClasses(CastleTestCase.class);
	   
	   System.out.println("Total Number Of test cases: "+ result.getRunCount());	
	   System.out.println("Total Number Of test cases Failed: "+ result.getFailureCount());
	   
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println("Final Status:" + ((result.wasSuccessful()==true)?"Success" : "Failure"));
   }
}
