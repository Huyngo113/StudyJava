/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanhmanglapdk;
import static Thuchanhmanglapdk.Ex3.show;
import java.util.Scanner;
import java.util.Random;
/**
 * Kiểm tra phần tử mảng 1 chiều khi nhập từ bàn phím
 * @author Ngo Huy
 */
public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        System.out.print("arr[0]= ");
        arr[0]=sc.nextInt();

        for(int j=1; j<n;j++){
            do{System.out.print("arr["+j+"]= ");
            arr[j]=sc.nextInt();
            }
            while(KT2(arr[j],n,j,arr));
        }
        show(arr);
    }
    public static boolean KT1 (int a, int i){
        boolean rs = false;
        if(a==i) rs=true;
        return rs;
    }
    public static boolean KT2 (int a, int n,int j,int arr[]){
        boolean rs = false;
        for (int i=0;i<j;i++){if(KT1(a,arr[i])){rs=true;}}
        return rs;
    }
}

