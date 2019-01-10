/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *
 */
public class bai2 {

    /**kiểm tra số chẵn lẻ
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc =new Scanner(System.in);   
       int a;
        System.out.print("a= ");
       a=sc.nextInt();
       if (a%2==0){
           System.out.println("a là số chẵn");
       }
       else {System.out.println("a là số lẻ");}
    }
    
}
