/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanhmanglapdk;
import java.util.Random;
import java.util.Scanner;

/**
 *Tìm phần tử đầu tiên trong mảng nguyên có chữ số đầu là lẻ
 * @author Ngo Huy
 */
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        // mảng random, in mảng
        for (int i = 0; i < n; i++) {
            arr[i]=rd.nextInt(500);
            System.out.println("arr["+i+"] = "+arr[i]);  
        }
        int b=n;
        for (int j = 0; j < n; j++) {
            int a=arr[j];
            do {
                a/=10;
            }
            while(a>9);
            if (a%2!=0){b=j;break;}
        } System.out.println("số cần tìm arr["+b+"] = " +arr[b]);
        }
            }
