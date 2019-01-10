/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanhmanglapdk;
import java.util.Random;
import java.util.Scanner;
/**
 *Tìm vị trí phần tử có giá trị x xuất hiện cuối cùng trong mảng
 * @author Ngo Huy
 */
public class Ex1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
        int a[]= new int[50];
        System.out.print("x = ");
        int x= sc.nextInt(); int b=50;
        for(int i=0;i<a.length;i++){
            a[i]=rd.nextInt(50);
            System.out.print(" "+a[i]+" ");
            if(a[i]==x) {
            b=i;
            } 
        } 
        if(b==50){System.out.println("trong chuỗi ko có giá trị "+x);}
        else {System.out.println("");
        System.out.println(" a["+b+"]");}
}}
