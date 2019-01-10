/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanhmanglapdk;
import java.util.Scanner;
import java.util.Random;
/**
 *Tìm phần tử đầu tiên có dạng 2^k
 * @author Ngo Huy
 */
public class Ex9 {
    @SuppressWarnings("empty-statement")
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
            System.out.println("arr["+i+"] = " +arr[i]);
        }
        int b=n;
        for (int j=0;j<n;j++){
          for(int k=1;k<10;k++){// 9 là loga cơ số 2 của 500 
              if (arr[j]==Math.pow(2,k)){b=j;break;};
          }
        }
        if(b==n){System.out.println("ko có số phù hợp");}else{System.out.println("Số cần tìm là arr["+b+"] = " +arr[b]);}      
          
          
    }
}
