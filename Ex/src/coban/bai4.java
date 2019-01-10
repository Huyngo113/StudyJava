/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *tính tổng S= 1^2+2^2+3^2+.....+n^2
 * @author Ngo Huy
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i=1;
        float S=0;
        do {
            System.out.print("n= ");
            n=sc.nextInt();
        }
        while (n<=0);
        for(;i<=n;i++) {
        S+=(i*i);
        }
        System.out.println("S=" +S);
    }
    
}
