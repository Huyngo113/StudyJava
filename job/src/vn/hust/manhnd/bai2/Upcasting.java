/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.manhnd.bai2;

import java.util.Scanner;

/**
 *
 * @author nghiemmanh
 */
public class Upcasting {

    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        char c = 'a';
        i = c; // ?
        System.out.println(i);
        s = (short) c;
        f =  (float) d;
        long t = (int)new Scanner(System.in).nextDouble();

    }
}
