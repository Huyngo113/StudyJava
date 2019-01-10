/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.manhnd.bai4;
import java.util.Random;

/**
 *
 * @author nghiemmanh
 */
public class ArrayDemo {

    public static void main(String[] args) {
//        // khai bao
//        float mark[];
//        //cap phat bo nho
//        mark = new float[30];
//        float mark2[] = {1, 2, 3, 4};
//        // read
//        float d = mark2[2];
//        System.out.println(d);
//        System.out.println(mark2[2]);
//        //write
//        mark2[2] = 10;
//        System.out.println(mark2[2]);
//        System.out.println("================");
//        for(int i = mark.length - 1; i >= 0; i--){
//            mark[i] = i;
//            System.out.println(mark[i]);
//        }

//        int a[][];
//        a = new int[3][5];
//
//        for (int i = 0; i < a.length; i++) {
//            int tmp[] = a[i];
//            for (int j = 0; j < tmp.length; j++) {
//                tmp[j] = i + j;
//                System.out.println(tmp[j]);
//            }
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.println(a[i][j]);
//            }
//        }
//
//        int b[][][];
//        b = new int[3][5][8];
//
//        for (int i = 0; i < b.length; i++) {
//            int tmp1[][] = b[i];
//            for (int j = 0; j < tmp1.length; j++) {
//                int tmp[] = tmp1[j];
//                for (int k = 0; k < tmp.length; k++) {
//                    tmp[j] = i + j;
//                    System.out.println(tmp[j]);
//                }
//            }
//        }
        int MAX = 1000000000;
        int c[] = new int[MAX];
        
        for (int i = 0; i < c.length; i++) {
            c[i] = new Random().nextInt(100000000);
        }
        
        for (int i = 0; i < c.length; i++) {
             System.out.println(c[i]);;
        }
        

    }

}
