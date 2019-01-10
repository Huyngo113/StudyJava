/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import java.util.Scanner;
/**
 *Tìm giá trị lớn nhất, nhỏ nhất của mảng số nguyên
 * @author Ngo Huy
 */
public class bai1 {
    public static void main(String[] args) {
        int a[]= {1,5,3,9,7,10,30,21};
        int min=a[1];
        int max=a[1];
        for(int i=0;i<a.length;i++) {
            if (min>a[i]){min=a[i];}
            if (max<a[i]){max=a[i];}
        }
        System.out.println("MIN = " +min);
        System.out.println("MAX = " +max);
    }
}
