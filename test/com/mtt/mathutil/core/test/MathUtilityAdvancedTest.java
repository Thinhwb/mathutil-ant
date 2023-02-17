package com.mtt.mathutil.core.test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
import com.mtt.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author mthin
 */
@RunWith(value = Parameterized.class)
public class MathUtilityAdvancedTest {

    // cchuẩn bị data là mảng 2 chiều kiểu Object
    // JUnit tự loop duyệt mảng lôi tách data ra 
    //giúp ta fill vào hàm assertEquals()
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20};
        return new Object[][]  {{0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                                {6, 720}};
        //  return b;
    }
//Map tungwf cột từng dòng vào 2 biến  tương ứng n và expected;
    @Parameterized.Parameter(value = 1)
    public long expected;

    @Parameterized.Parameter(value = 0)
    public int n;

    //sách expected và actual
    @Test
    public void testFactorialGivenRightArguementReturnsWell() {
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
    }
}
