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
 * Xóa phần tử có giá trị lớn nhất trong mảng
 * @author Ngo Huy
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        // mảng random
        int b=0;
        int c =n;
        for (int i = 0; i < n; i++) {
            arr[i]=rd.nextInt(500);
            if(arr[i]>b){b=arr[i];c=i;} 
        } 
        show(arr);
        System.out.println("max =  "+b+"; c = "+c);
        for (int j = c; j < n-1; j++) {
            arr[j]=arr[j+1];
        }
        int arr1[]= new int[n-1];
        for (int k=0; k<arr1.length; k++){arr1[k]=arr[k];}
        show(arr1);
    }
}
