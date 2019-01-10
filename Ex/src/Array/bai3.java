/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *Viết hàm tìm số chẵn cuối cùng trong mảng 1 chiều số nguyên
 * @author Ngo Huy
 */
public class bai3 {
    public static void main(String[] args) {
        int a[]={3,6,8,12,16,18,9,7};
        int s=0;
        for(int i=0;i<a.length;i++){
            if (a[i]%2==0) {
            s=a[i];
            }
        }
        System.out.println("Số chẵn cuối cùng trong chuỗi: " +s);
    }
}
