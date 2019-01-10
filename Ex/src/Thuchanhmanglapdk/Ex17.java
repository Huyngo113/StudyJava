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
 * Chèn phần tử X vào tất cả các phần tử chẵn của mảng
 * @author Ngo Huy
 */
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        System.out.print("NHập x = ");
        int x= scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        // mảng random
        for (int i = 0; i < n; i++) {
            arr[i]=rd.nextInt(500);
        }
        show(arr);System.out.println("");
        for (int j =0; j<n;j++){
            if(j%2==0){arr[j]=x;}
        }
        show(arr);
    }
}
