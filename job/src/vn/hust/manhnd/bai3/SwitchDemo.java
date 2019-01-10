/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.manhnd.bai3;

import java.util.Scanner;

/**
 *
 * @author nghiemmanh
 */
public class SwitchDemo {

    public static void main(String[] args) {
//        int day = 0;
//        System.out.println("Nhap ngay: ");
//        day = new Scanner(System.in).nextInt();
//
//        switch (day) {
//            case 1: {
//                System.out.println("CN");
//                break;
//            }
//            case 2: {
//                System.out.println("Thu 2");
//                break;
//            }
//            case 3: {
//                System.out.println("Thu 3");
//                break;
//            }
//            case 4: {
//                System.out.println("Thu 4");
//                break;
//            }
//            default: {
//                System.out.println("Khong xac dinh");
//                break;
//            }
//        }
//
//        switch (day) {
//            case 1:
//                System.out.println("CN");
//                break;
//            case 2:
//                System.out.println("Thu 2");
//                break;
//            case 3:
//                System.out.println("Thu 3");
//                break;
//            default:
//                System.out.println("KHong xac dinh");
//                break;
//        }

        int a;
        int b;
        int option;

        System.out.println("=======CASIO=========");
        System.out.println("1. Tinh Tong");
        System.out.println("2. Tinh Hieu");
        System.out.println("3. Tinh Tich");
        System.out.println("4. Tinh Thuong");
        System.out.println("Moi ban nhap vao chuc nang tuong ung voi so thu tu (1-4): ");
        option = new Scanner(System.in).nextInt();

        switch (option) {
            case 1: {
                //tong
                System.out.println("Chuc nang tinh tong. Moi ban nhap du lieu...");
                System.out.println("Nhap a = ");
                a = new Scanner(System.in).nextInt();
                System.out.println("Nhap b = ");
                b = new Scanner(System.in).nextInt();
                System.out.println("\n Ket qua: a+b=" + (a + b));
                break;
            }
            case 2: {
                System.out.println("Nhap a = ");
                a = new Scanner(System.in).nextInt();
                System.out.println("Nhap b = ");
                b = new Scanner(System.in).nextInt();
                System.out.println("a-b=" + (a - b));
                break;

            }
            case 3: {
                System.out.println("Nhap a = ");
                a = new Scanner(System.in).nextInt();
                System.out.println("Nhap b = ");
                b = new Scanner(System.in).nextInt();
                System.out.println("a*b=" + (a * b));
                break;

            }
            case 4: {
                System.out.println("Nhap a = ");
                a = new Scanner(System.in).nextInt();
                System.out.println("Nhap b = ");
                b = new Scanner(System.in).nextInt();
                System.out.println("a/b=" + (a / b));
                break;

            }
            default: {
                System.out.println("Chuc nang ban nhap chua ho tro!");
                break;
            }
        }
    }
}
