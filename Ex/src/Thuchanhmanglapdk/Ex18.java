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
 * Tách 1 mảng thành 2 mảng chẵn và lẻ
 * @author Ngo Huy
 */
public class Ex18 {
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
        int d=0;
        for (int j=0;j<n;j++){
            if(arr[j]%2==0){c++;}else{d++;}
        }
        int mangChan[]= new int[c];
        int mangLe[]=new int [d];
        int a=0;int b=0;
        for (int k=0; k<n;k++){
         if(arr[k]%2==0){mangChan[a]=arr[k];a++;}
         else{mangLe[b]=arr[k];b++;
                 }
        }
        System.out.println("");
        System.out.println(" Mảng chẵn : ");
        show(mangChan);System.out.println("");
        System.out.println(" Mảng lẻ : ");
        show(mangLe);
    }
}
