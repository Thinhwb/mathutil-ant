/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mtt.mathutil.main;

import com.mtt.mathutil.core.MathUtility;

/**
 *
 * @author mthin
 * String pool, static bài 8 trong java static cho 1 phan ram dùng chung và ko xài nữa
 * com.giaolang.mathutil.core
 * thuận ngữ Singleton kĩ thuật class xài static
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /****/
        testFactorialGivenRightArgumentReturnsWell();
        testFactorialGivenWrongThrowExpected();
        
    }
    public static void testFactorialGivenWrongThrowExpected(){
        System.out.println("Test -1: expected:AN Illegal Exception is throw!!!"
                + " | actual");
         MathUtility.getFactorial(1);
    }
    // kiểm thử xem hàm getF có đc viết đúng như thiết kế hay ko ?
    // Tkế đưa n tử tế từ 0..20 tính đc n! như kì vòng
    //đưa n cà chớn => chửi
    //ta phải phải giả lập các cách xài usẻ hay của ai đó khác 
    // cách xài nghĩa là đưa giá trị nào đó cho hàm -> xem hàm trả về
    // mỗi cách xài hà, ứng với 1 n thì hàm sẽ chạy với n đó
    // mỗi cách xài hàm ta gọi là 1 test case
    // quy tắc đặt tên hàm cho kiểm thử code:
    //Cú pháp con lạc đà camelCase notation
    //tên hàm lun mang ý nghĩ, mục đích của veiẹc case 
    public static void testFactorialGivenRightArgumentReturnsWell() {
        /** test case#1 tình huống xài hàm số 1
                    // Test getF() n=0;
        * expected value: 1
        * kiểm thử xem hàn getF() với 1  tức tính 1! coi có trả về 1 ko 
        * 
        **/
        int n=0;                //tính 0!
        long expectedValue = 1; //Hi vọng về 1
        long actualValue = MathUtility.getFactorial(n) ;     // hàm tính đi , xem cụ thể mâys
        // kiểm thử so sách expected và actual
        System.out.println("Test"+n+"!: expected: "+expectedValue
                                        +" | actual: "+actualValue);
       
    /**
     Test case #2 getF() with n =1
     * expected value : 1
     * Kiểm tra tình huống xài hàm tính 1 ! coi có trả về 1 hay hem?
     * 
     **/
    n=1;
    expectedValue= 1;
    actualValue= MathUtility.getFactorial(n);
    System.out.println("Test"+n+"!: expected: "+expectedValue
                                        +" | actual: "+actualValue);
    
    /**
     Test case #3 getF() with n =2
     * expected value : 2
     * Kiểm tra tình huống xài hàm tính 1 ! coi có trả về 1 hay hem?
     * 
     **/
     System.out.println("Test 2"+"!: expected: 2"
                                        +" | actual: "+MathUtility.getFactorial(2));
     
     System.out.println("Test 3"+"!: expected: 6"
                                        +" | actual: "+MathUtility.getFactorial(3));
     System.out.println("Test 4"+"!: expected: 120"
                                        +" | actual: "+MathUtility.getFactorial(5));
    }
    
    //test 6
    
    
}
