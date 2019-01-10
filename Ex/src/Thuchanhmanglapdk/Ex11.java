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
 *Xóa phần tử tại vị trí lẻ trong mảng
 * @author Ngo Huy
 */
public class Ex11 {
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
        show(arr);
        int c=0;
        for(int j=c=0;j<n;j++){
          if(j%2==0){arr[c]=arr[j];c++;}
        }
        int arr1[]=new int [c];
        for (int k=0; k<c;k++){
            arr1[k]=arr[k];
        }
        System.out.println("n = "+n);
        show(arr1);
    }
}
