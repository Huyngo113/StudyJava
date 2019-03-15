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
 * Chèn X vào phía sau phần tử có giá trị lớn nhất trong mảng
 * @author Ngo Huy
 */
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        System.out.print("Nhập x = ");
        int x = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        // mảng random
        // mảng random
        int b=0; int y=10;
        System.out.println("y bằng"+y);
        int c =n;
        for (int i = 0; i < n; i++) {
            arr[i]=rd.nextInt(500);
            y=12; System.out.println("y2 bằng" +y);
            if(arr[i]>b){b=arr[i];c=i;} 
        } 
        System.out.println("y3 bằng"+y);
        show(arr);
        int arr1[]= new int[n+1];
        for (int k=0; k<c+1; k++){
            arr1[k]=arr[k];
        }
        arr1[c+1]=x;
        for(int j=c+2; j<n+1;j++){
            arr1[j]=arr[j-1];
        }
        System.out.println("");
        show(arr1);
}}
