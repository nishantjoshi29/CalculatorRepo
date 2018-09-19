package com.cg.test;

import junit.framework.Assert;

import org.junit.Test;

import com.cg.bean.Calculator;

public class TestCalculator {
          @Test
          public void testAdd()
          {
        	  Calculator calc=new Calculator();
        	  int res=calc.add(3,4);
        	  Assert.assertEquals(7,res );
          }
          @Test
          public void testSubtract()
          {
        	  Calculator calc=new Calculator();
        	  int res=calc.subtract(6,2);
        	  Assert.assertEquals(4,res );
          }
          
          @Test
          public void testMultiply()
          {
        	  Calculator calc=new Calculator();
        	  int res=calc.multiply(2,4);
        	  Assert.assertEquals(8,res );
          }
          
}
