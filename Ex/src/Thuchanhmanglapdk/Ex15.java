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
 * Chèn X vào vị trí đầu của mảng 1 chiều
 * @author Ngo Huy
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        System.out.print("Nhập x = ");
        int x= scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        // mảng random
        for (int i = 0; i < n; i++) {
            arr[i]=rd.nextInt(500);
        }
        show(arr);System.out.println("");
        int arr1[] =  new int[n+1];
        arr1[0]=x;
        for(int k=0; k<n; k++){
             arr1[k+1]=arr[k];
        }
        System.out.println("Mảng mới là ");
        show(arr1);
    }
}
