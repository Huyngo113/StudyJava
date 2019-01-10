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
public class BT02 {

    public static void main(String[] args) {
        float a;
        System.out.println("Nhap mot so bat ky:");
        a = new Scanner(System.in).nextFloat();

        if (a >= 0 && a < 1000) {
            //tinh can bac 2
            double kq = Math.sqrt(a);
            System.out.printf("Can bac hai cua %f = %f ", a, kq);
            if (kq > 2) {
                System.out.println("So nay lon hon 2");
            }
        } else if (a >= 1000) {
            System.out.println("Toi khong the tinh can cho ban."
                    + "Ban vua nhap vao mot so qua lon!");
        } else {
            System.out.println("Toi khong the tinh can cho ban."
                    + "Ban vua nhap vao mot so am!");
        }
    }
}
