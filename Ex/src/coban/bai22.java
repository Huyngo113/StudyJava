/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *HCN sao
 * @author Ngo Huy
 */
public class bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h; int w; int i=1; 
        do {
            System.out.print("h = ");
            h=sc.nextInt();
        } while (h<=0);
        do {
            System.out.print("w = ");
            w=sc.nextInt();
        } while (w<=0);
        for(;i<=h;i++){
            for(int j=1;j<=w;j++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
