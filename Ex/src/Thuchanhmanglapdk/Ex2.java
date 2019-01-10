/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanhmanglapdk;
import java.util.Random;
import java.util.Scanner;
/**
 *Tìm phần tử trong mảng gần(hoặc xa)giá trị x
nhất
 * @author Ngo Huy
 */
public class Ex2 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc= new Scanner(System.in);
        System.out.print("x = ");
        int x=sc.nextInt();
        int a[]= new int[50];
        int c=50; int b=0; int d=50;
        for(int i=0;i<a.length;i++){
            a[i]=rd.nextInt(50);}
        for (int k=0;k<a.length;k++){b=Math.abs(a[k]-x);
            if (b!=0){break;}
            }
        for (int j=0;j<a.length;j++){
            System.out.println(" a["+j+"] ="+a[j]+" ");
            if(Math.abs(a[j]-x)!=0&&b>Math.abs(a[j]-x)){
                b=Math.abs(a[j]-x);
                c=j;
            }}
        for (int l=c;l<a.length;l++){
            if(Math.abs(a[l]-x)==b&&a[l]!=a[c]){
                d=l;
            }
        }
        if (d==50){System.out.println("giá trị gần x nhất là " +a[c]);}
        else{System.out.println("giá trị gần "+x+" nhất là "+a[c]+" và "+a[d]);}
    }
}
