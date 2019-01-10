/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
import static coban.giaithua.GT;
/**
 *Tính tổng S(n) = 1 + x^2/2! + x^4/4! +…+ x^2n/(2n)!
 * @author Ngo Huy
 */
public class bai19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n; float S=1; float x; int a=1;
        do{
            System.out.print("n = ");
            n=sc.nextInt();
        }
        while(n<=0);
        System.out.print("x = ");
        x=sc.nextFloat();
        for (int i= 1;i<=n;i++) {
        S+=Math.pow(x,2*i)/GT(2*i);
        }
        System.out.print("S = "+S);
    }
}
