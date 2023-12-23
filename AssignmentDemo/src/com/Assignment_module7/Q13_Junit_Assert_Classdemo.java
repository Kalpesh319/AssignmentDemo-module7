package com.Assignment_module7;

import org.junit.Assert;
import org.testng.annotations.Test;

/*
 * W.a.junit program to handled Assert class with all method to check its
  pass or fail
 * 
 * 
 * 
 */

public class Q13_Junit_Assert_Classdemo {
	//@Ignore
	@Test
	public void test() {
		
	}
	public void test1() {
		String name1=null;
		String name2="kishu";
		Assert.assertEquals(name1,name2 );
		
	}

}
