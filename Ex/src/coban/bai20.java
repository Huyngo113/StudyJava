/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *vẽ tam giác bằng **
 * @author Ngo Huy
 */
public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h; int i=1; 
        do {System.out.print("h = ");
            h=sc.nextInt();}
        while(h<=0);
        
        for(;i<=h;i++) {
            for(int j=1; j<=h-i;j++) {
            System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++) {
            System.out.print("* ");
        }
            System.out.println("");
        }
    }
}
