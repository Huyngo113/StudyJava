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
 * Đảo ngược dãy số
 * @author Ngo Huy
 */
public class Ex25 {
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
        show(arr);System.out.println("");
        int c=0; 
        int arr1[]= new int[n];
        for(int j=n-1;j>=0;j--){
            arr1[c]=arr[j];c++;
        }
        System.out.println("Mảng đảo ngược:");
        show(arr1);
        
    }
}
