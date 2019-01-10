/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *
 * @author Ngo Huy
 */
public class bai21 {
    public static void main(String[] args) {
                int h;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("height = ");
            h = sc.nextInt();
        }while(h <= 0);
         
        for(int i = 1; i <= h; i++) {
            for(int j = 1; j <= h-i; j++) {
            System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
            System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
