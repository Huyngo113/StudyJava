/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *tính tổng sn= 1+2+3+....+n
 * @author Ngo Huy
 */
public class bai3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i=0;
        int tong=0;
        
        do {
        System.out.print("n= ");
        n=sc.nextInt();
        }
        while (n<=0);
        for(;i<=n;i++) {
        tong+=i;
        }
         System.out.println("Sn= " +tong);
        
    
}
}
