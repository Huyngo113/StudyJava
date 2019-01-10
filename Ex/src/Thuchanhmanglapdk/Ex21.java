/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanhmanglapdk;

import static Thuchanhmanglapdk.Ex3.show;
import java.util.Random;
import java.util.Scanner;

/**
 * Kiểm tra dãy A có phải là con của dãy B không?
 * @author Ngo Huy
 */
public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng 1: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arrA = new int [n];
        // mảng random
        for (int i = 0; i < n; i++) {
            arrA[i]=rd.nextInt(500);
        }
        show(arrA);System.out.println("");
        System.out.print("Nhập số phần tử của mảng 2: ");
        int m = scanner.nextInt();
        // khởi tạo arr
        int [] arrB = new int [m];
        // mảng random
        for (int j = 0; j < m; j++) {
            arrB[j]=rd.nextInt(500);
        }
        show(arrB);System.out.println("");
        if(n>m){System.out.println("arrA ko phải con của arrB");}
        else{
            int c=0;
            for(int k=0;k<n;k++){
                for(int l=0;l<m;l++){
                if(arrB[l]==arrA[k]){c++;break;}
                }
            }
            if(c==n){System.out.println("arrA là tập con của arrB");}else{System.out.println("arrA ko phải con của arrB");}
        }
    }
}
