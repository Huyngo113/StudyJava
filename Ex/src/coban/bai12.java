/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *Tính S(n) = 1 + 1.2 + 1.2.3 +…+ 1.2.3…n
 * @author Ngo Huy
 */
public class bai12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        int i=1;
        int S=0;
        int a=1;
        do{
            System.out.print("n= ");
            n=sc.nextInt();
        }
        while (n<=0);
        for(;i<=n;i++) {
            a*=i;
            S+=a;
            }
        
        System.out.println("S= " +S);
    }
}
