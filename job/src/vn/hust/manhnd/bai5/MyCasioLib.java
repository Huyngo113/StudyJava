/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.manhnd.bai5;

/**
 *
 * @author nghiemmanh
 */
public class MyCasioLib {

//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        
//        int c = sum(30, b);
//        System.out.println(c);
//    }
    /**
     * Sum of a and b
     *
     * @param a
     * @param b
     * @return (a+b)
     */
//    public static int sum(int a, int b) {
//        int rs;
//        rs = a + b;
//        return rs;
//    }

    public static int sum(int... x) {
        int rs = 0;
        for (int i = 0; i < x.length; i++) {
            rs = rs + x[i];
        }
        return rs;
    }

    public static int sub(int a, int b) {
        int rs;
        rs = a - b;
        return rs;
    }

    public static double div(float a, float b) {
        double rs = Double.NaN;
        if (b != 0) {
            rs = a / b;
        }
        return rs;
    }

    public static double min(double a, double b) {
        double rs = a;
        if (b < a) {
            rs = b;
        }
        return rs;
    }

}
