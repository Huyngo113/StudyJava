/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.manhnd.bai3;

/**
 *
 * @author nghiemmanh
 */
public class LoopDemo {

    public static void main(String[] args) {
//        int a = 0;
//        while (a < 10) {
//            System.out.println(a++);
//        }
//        a = 0;
//        while (true) {
//            if (a > 9) {
//                break;
//            }
//            System.out.println(a++);
//        }
//        System.out.println("=========");
//        do {
//            System.out.println(a);
//        } while (a++ >= 10 && a < 100);
//
//        System.out.println("=====FOR=====");
//        int i = 0;
//        for (;;) {
//            System.out.println(i++);
//        }

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println("=============");
        }

    }
}
