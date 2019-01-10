/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanhmanglapdk;
import static Thuchanhmanglapdk.Ex3.sortASC;
import java.util.Scanner;
import java.util.Random;
/**
 * Tìm đoạn [a, b] chứa các giá trị phần tử của mảng
 * @author Ngo Huy
 */
public class Ex4 {
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
        // sắp xếp dãy số theo thứ tự tăng dần
        sortASC(arr);
        System.out.println("đoạn chứa các phần tử của mảng là ["+arr[0]+";"+arr[n-1]+"]");
    }
}
