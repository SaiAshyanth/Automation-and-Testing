package com.practice;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Day9_5 {
  @Test
  public void FirstMethod() {
	  Assert.assertEquals(true, false);
  }
  
  @Test
  public void SecondMethod() {
	  Assert.assertEquals(true, true);
  }
  
}