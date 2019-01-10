/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanhmanglapdk;

import static Thuchanhmanglapdk.Ex23.dem;
import static Thuchanhmanglapdk.Ex3.show;
import java.util.Random;
import java.util.Scanner;

/**
 * Tìm phần tử xuất hiện nhiều nhất trong mảng số nguyên
 * @author Ngo Huy
 */
public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        // mảng random
        for (int i = 0; i < n; i++) {
            arr[i]=rd.nextInt(500);
        }
        int c=0; int d=n;
        for(int j=0; j<n;j++){
        if(dem(arr[j],arr, n)>c){c=dem(arr[j],arr, n);d=j;}// hàm dem đếm số lần xuất hiện của a[j] trong mảng arr
        }
        System.out.println("phần tử xuất hiện nhiều nhất là: arr["+d+"] = "+arr[d]+" với "+c+" lần xuất hiện.");
    }
}
