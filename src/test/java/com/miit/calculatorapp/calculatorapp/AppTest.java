package com.miit.calculatorapp.calculatorapp;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test(){
    	Calculator obj1 = new Calculator();
    	int outputAdd = obj1.addition(2,3);
    	assertEquals(5,outputAdd);
    	
  

    }
    
    @Test
    public void test2(){
    	
    	
    	Calculator obj2 = new Calculator();
    	int outputSub = obj2.subtraction(3,1);
    	assertEquals(2,outputSub);
    	
    	
    }
    
    @Test
    public void test3(){
    	
    	Calculator obj3 = new Calculator();
    	int outputMulti = obj3.multiplication(3,2);
    	assertEquals(6,outputMulti);

    }
    
//    @Test
//    public void test4(){
//    	
//    	Calculator obj4 = new Calculator();
//    	float outputDivi = obj4.division(3,1);
//    	assertEquals(3,outputDivi);
//
//    }
//    
	   
}
