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
 * Xóa các phần tử trùng với X trong mảng 1 chiều
 * @author Ngo Huy
 */
public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        System.out.print("Nhập x = ");
        int x =scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        // mảng random
        int c=0;
        for (int i = 0; i < n; i++) {
            arr[i]=rd.nextInt(500);
            if(arr[i]==x){c++;}
        } 
        show(arr);System.out.println("");
        if(c==0){System.out.println("trong mảng ko có phần tử bằng x");}
        else{
        int arr1[]= new int[n-c];
        int d=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=x){arr1[d]=arr[j];d++;}
        }
        System.out.println("Mảng sau khi xóa x:");
        show(arr1);}
    }
}
