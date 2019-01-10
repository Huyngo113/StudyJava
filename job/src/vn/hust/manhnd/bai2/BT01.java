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
public class BT01 {

    public static void main(String[] args) {
        float a;
        float b;
        System.out.println("Nhap chieu dai: ");
        a = new Scanner(System.in).nextFloat();
        System.out.println("Nhap chieu rong: ");
        b = new Scanner(System.in).nextFloat();

        System.out.println("Dien tich: " + (a * b));
        System.out.println("Chu vi: " + (a + b) * 2);

    }
}
