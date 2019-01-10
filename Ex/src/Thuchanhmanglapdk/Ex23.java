/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanhmanglapdk;

/**
 * Đếm số lầ xuất hiện của 1 phần tử 
 * @author Ngo Huy
 */
public class Ex23 {
    public static int dem(int b,int a[], int n) {
        int c=0;
            for(int i=0;i<n;i++){
            if (a[i]==b){c++;}
            }
        return c;
    }
    public static boolean kiemtra(int arr[], int n, int a) {
    int i;boolean c=false;
    for(i = 0; i < n; i++)
        if(arr[i]==a){
            c=true;}else{c= false;}
    return c;
    }
}
