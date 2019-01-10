/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanhmanglapdk;
import java.util.Scanner;
import java.util.Random;
/**
 *Tìm số chính phương đầu tiên trong mảng số nguyên
 * @author Ngo Huy
 */
public class Ex7 {
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
            System.out.println("arr["+i+"] = "+arr[i]);
        }
        int a=0;
        for (int k=0; k<n;k++){
            int b=(int)Math.sqrt(arr[k]);
            if(arr[k]!=0&&b*b==arr[k]) {a=b;}
        }
        if(a==0){System.out.println("Mảng ko có số chính phương nào");}
        for (int j=0; j<n;j++){
            int tem=(int)Math.sqrt(arr[j]);
            if(arr[j]!=0&&tem*tem==arr[j]){System.out.println("số chính phương đầu tiên là arr["+j+"] = "+arr[j]);break;}
        }
        
    }
}
