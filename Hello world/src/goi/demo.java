/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goi;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    static void display(int[] a) {
        int max = 0;
        int[] b = new int[a.length]; // tao mang b co a.length phan tu = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[i] == a[j]) {
                    b[i]++;
                }
            }
        }
        // tim gia tri max
        max = b[0];
        for (int i = 1; i < a.length; i++) {
            if (b[i] > max) {
                max = b[i]; // tim dc phan tu co so lan xuat hien max
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            if (b[i] == max) {
                System.out.println("phan tu " + a[i] + " co so lan xuat hien la " + max);
            }
        }
    }

    static void nhap() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Nhập số lượng pt");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(1000);
            System.out.println(" " + a[i] + " ");
        }
        display(a);
    }

    public static void main(String[] args) {
        nhap();
    }
}