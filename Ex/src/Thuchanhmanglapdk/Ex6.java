/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanhmanglapdk;
import java.util.Random;
import java.util.Scanner;

/**
 * Tìm phần tử đầu tiên của mảng lớn hơn 2018
 * @author Ngo Huy
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        // mảng random
        for (int i = 0; i < n; i++) {
            arr[i]=rd.nextInt(5000);
        }
        int a=n;
        for (int k=0 ; k<n; k++){
            if (arr[k]>2018){
            a=k;
            }
        }
        if (a==n) {System.out.println("ko có phần tử nào lớn hơn 2018");} 
        for (int j=0 ; j< n; j++) {
            if(arr[j]>2018) {
                System.out.println("phần tử đầu tiên của mảng lớn hơn 2018 là arr["+j+"] = " +arr[j]); break;
            }
        }
    }
}
