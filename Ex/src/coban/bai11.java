/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *Tính giai thừa
 * @author Ngo Huy
 */
public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i=1;
        int S=1;
        do{
            System.out.print("n= ");
            n= sc.nextInt();
        }
        while (n<=0);
        for (;i<=n;i++){
        S*=i;
        }
        System.out.print("n!= " +S);
    }
}
