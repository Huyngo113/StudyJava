/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanhmanglapdk;
import static Thuchanhmanglapdk.Ex3.show;
import static Thuchanhmanglapdk.Ex3.sortASC;
import java.util.Random;
import java.util.Scanner;

/**
 *Tìm phần tử có giá trị lớn nhất và có chứa toàn chữ số lẻ
 * @author Ngo Huy
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];// khởi tạo arr
        for (int i = 0; i < n; i++) {
            arr[i]=rd.nextInt(500);// mảng random
        }
        sortASC(arr);// hàm sắp xếp dãy số theo thứ tự tăng dần
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        show(arr);// hàm in ra 
        int c=n;
        for (int j=n-1;j>=0;j--){
            int a=arr[j];
            int b=arr[j]%10;
            while(a>9&&b%2!=0){
            a/=10;b=a%10;
            }
            if(a%2!=0&&b%2!=0){c=j;break;}
        }
        if(c==n){System.out.println("ko có số phù hợp");}
        else {System.out.println("SỐ CẦN TÌM LÀ " +arr[c]);}
    }
}
