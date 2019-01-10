/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *in ra dãy fibonacci
 * F(n)=| 1 nếu n=1.
 *      | 1 nếu n=2.
 *      | F(n-1)+F(n-2) nếu n>2.
 * @author Ngo Huy
 */
public class bai23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a0,a1,a2,n;
        a0=1;
        a1=1;
        do {
        System.out.print("n = ");
        n=sc.nextInt();
        }while(n<0);
        System.out.printf("%d  %d",a0,a1);
        a2=a0+a1;
        while (a2 <= n){
        System.out.printf("  %d",a2);
        a0=a1;
        a1=a2;
        a2=a0+a1;
    }
    }
}
