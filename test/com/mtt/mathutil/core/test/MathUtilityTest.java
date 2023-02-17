/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mtt.mathutil.core.test;

//import org.junit.jupiter.api.Test;


import com.mtt.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mthin
 */

public class MathUtilityTest {
    
//    public MathUtilityTest() {
//    Viet cacs test case, cacs tinh huong test 
    // Test cà chớn  thiết kế của hàm getF như sau  
    //  Nếu đưa N tử tế thif getf pải ngon 
    //nếu n cà chơn , nó chửi, ném ra noại 
    //Junit 4 ko có hàm assểtqual cho 
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-1);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
      //case1: test getF with n =0
      //expective result =1
      int n=0;
      long expected =1; 
      long actual =MathUtility.getFactorial(n);
      
      Assert.assertEquals(expected, actual);
      // Xanh Giong, Do khac 
      
        //test case 2: getF with 1 =1;
       n=1;
       expected =1; 
       actual =MathUtility.getFactorial(n);
      Assert.assertEquals(expected, actual);
 
      //Test Case 3: getF n=2
      //n =2
      Assert.assertEquals(2, MathUtility.getFactorial(2));
      // n=3
      Assert.assertEquals(6, MathUtility.getFactorial(3));
      //n=5
      Assert.assertEquals(120, MathUtility.getFactorial(5));
    }
  
    @Test 
    public void testRedGreen(){
        Assert.assertEquals(6789, 6789);
    }
}
