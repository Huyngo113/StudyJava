/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *Tính tổng S(n) = x + x^2 + x^3 +…+ x^n
 * @author Ngo Huy
 */
public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i=1;
        int S=0;
        int x;
        int a=1;
        do{
            System.out.print("n= ");
            n=sc.nextInt();
        }
        while(n<=0);
        System.out.print("a= ");
        x=sc.nextInt();
        for(;i<=n;i++){
            a*=x;
            S+=a;
        }
        System.out.print("S= "+S);
    }
}
