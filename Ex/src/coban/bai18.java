/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *Tính tổng S(n) = x + x^2/2! +…+ x^n/n!
 * @author Ngo Huy
 */
public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; float x; float S= 0; int a=1; int i=1;
        do{
            System.out.print("n = ");
            n=sc.nextInt();
        }
        while(n<=0);
        System.out.print("x = ");
        x=sc.nextFloat();
        for (;i<=n;i++) {
        a*=i;
        S+=1.0*Math.pow(x,i)/a;
        }
        System.out.print("S = "+S);
    }
}
