package test;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

@RunWith(Suite.class)
@SuiteClasses({ test1.class, test2.class, test3.class, test4.class })
public class AllTests {
   public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(test1.class, test2.class, test3.class, test4.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println("Resultado del proceso: "+ result.wasSuccessful());
	   }
}
