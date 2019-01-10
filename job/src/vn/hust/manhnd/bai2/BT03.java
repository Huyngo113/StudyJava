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
public class BT03 {

    public static void main(String[] args) {
        int day, month, year;
        System.out.println("Nhap ngay");
        day = new Scanner(System.in).nextInt();
        System.out.println("Nhap thang");
        month = new Scanner(System.in).nextInt();
        System.out.println("Nhap nam");
        year = new Scanner(System.in).nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Năm " + year + " là năm nhuận!");
        }
        
        // Tìm hiểu giải thuật DOOMSDAY
    }
}
