package org.example;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
@Test
public void addNumber(){
    Calculator cal=new Calculator();
    Assert.assertEquals(60,cal.addNumber(27,33));//positive numbers
    Assert.assertEquals(-50,cal.addNumber(-21,-29));//negative numbers
    Assert.assertEquals(-65,cal.addNumber(20,-85));//both +ive & -ive numbers
    Assert.assertEquals(45,cal.addNumber(0,45));//Zero case
    Assert.assertEquals(8,cal.addNumber(8,0));//Zero case
}
@Test
public void getStringLength(){
    StringLength len=new StringLength();
    Assert.assertEquals(7,len.getStringLength("Morning"));
    Assert.assertEquals(12,len.getStringLength("Good Morning"));
    Assert.assertEquals(0,len.getStringLength(""));
    Assert.assertEquals(1,len.getStringLength(" "));
}
@Test
public void isEven(){
    NumberUtils utils=new NumberUtils();
    Assert.assertTrue(utils.isEven(28));
    Assert.assertFalse(utils.isEven(15));
    Assert.assertTrue(utils.isEven(0));
}
@Test
public void isPrime(){
    IsPrime util=new IsPrime();
    Assert.assertTrue(util.isPrime(11));
    Assert.assertFalse(util.isPrime(24));
    Assert.assertTrue(util.isPrime(17));
}
}
