/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import  java.util.Scanner;
/**
 *Tính tổng S(n) = 1 + 1/3 + 1/5 +…+ 1/(2n+1)
 * @author Ngo Huy
 */
public class bai7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i=0;
        float S=0;
        do{
            System.out.print("n= ");
            n=sc.nextInt();
        }
        while (n<=0);
        for (;i<=n;i++) {
            S+= 1.0/(2*i+1);
        }
         System.out.print("S= " +S);
     }
}
