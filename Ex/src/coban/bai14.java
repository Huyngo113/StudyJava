/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *Tính tổng Tính tổng S(n) = x^2 + x^4 +…+ x^2n
 * @author Ngo Huy
 */
public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i=1;
        int a=1;
        int S=0;
        int x;
        do{
            System.out.print("n= ");
            n=sc.nextInt();
        }
        while (n<=0);
        System.out.print("x= ");
        x=sc.nextInt();
        for(;i<=n;i++){
        a*=x*x;
        S+=a;
        }
        System.out.print("S=" +S);
}
}
