/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtt.mathutil.core;

/**
 *
 * @author mthin
 */
public class MathUtility {
    
    public static final double PI= 3.1415;
    
    
    /// hàm getFactorial() là hàm tính n!
    /// Quy ước: n! = 1*2*3*4*5*...*n
    ///          0! = 1
    ///          Không có giai thừa âm    
    /// Thiết kí của hàm tính giai thừa của chúng ta
    /// Hàm Khôgn tính giai thừa âm, nếu đauw ama giai thừa, chửi thằng đó ngu vl 
    /// HEAT MAP
    public static long getFactorial(int n){
        if (n<0 || n>21)
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 21");
        
        if (n==0 || n==1)
            return 1;
        //Sống sót đến lệch dưới đâu sure n= 2..20
       
        long product=1 ;
        for (int i = 2; i <n; i++) //make code wrong!!
            product *= i;
        
        return product;
    }
}
