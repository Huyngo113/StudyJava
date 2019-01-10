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
 * Nối 2 mảng số nguyên
 * @author Ngo Huy
 */
public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng 1: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        // mảng random
        int c=0;
        for (int i = 0; i < n; i++) {
            arr[i]=rd.nextInt(500);c++;
        }
        show(arr);System.out.println("");
        System.out.print("Nhập số phần tử của mảng 2: ");
        int m = scanner.nextInt();
        // khởi tạo arr
        int [] arr1 = new int [m];
        // mảng random
        int d=0;
        for (int j = 0; j < m; j++) {
            arr1[j]=rd.nextInt(500);d++;
        }
        show(arr1);System.out.println("");
        int a = c+d;
        int mangNoi[]=new int [a];
        for(int k=0;k<c;k++){
            mangNoi[k]=arr[k];
        }
        for(int l=0; l<d; l++){
            mangNoi[c]=arr1[l];c++;
        }
        System.out.println("Mảng đã nối");
        show(mangNoi);
    }


}
