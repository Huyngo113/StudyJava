/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *Tính tổng S(n) = 1 + 1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+…+n)
 * @author Ngo Huy
 */
public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i=1;
        float S=0f;
        do {
            System.out.print("n= ");
            n=sc.nextInt();
        }
        while (n<=0);
        int a=0;
        for(;i<=n;i++) {
            a+=i;
            S+=1.0/a;
        }
        System.out.print("S= "+S);
    }
}
