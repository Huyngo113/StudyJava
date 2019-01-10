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
 * Xóa tất cả các phần tử nhỏ hơn X
 * @author Ngo Huy
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        System.out.print("x = ");
        int x = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        // mảng random
        for (int i = 0; i < n; i++) {
            arr[i]=rd.nextInt(500);
        }
        show(arr);System.out.println("");
        int d=0;
        int c;
        for (int j= c = 0; j < n; j++) {
            if(arr[j]>=x){arr[c]=arr[j];c++;}
        }
        int arr1[]= new int[c];
        for (int k=0; k<arr1.length; k++){arr1[k]=arr[k];}
        System.out.println("mảng mới có các phần tử lớn hơn "+x+" là: ");
        show(arr1);
    }
}
