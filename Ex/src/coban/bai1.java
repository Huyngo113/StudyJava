/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *Tính tổng 2 số nguyên bất kì nhập từ bàn phím
 * @author Ngo Huy
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int tong;
        System.out.print("a= ");
        a=sc.nextInt();
        System.out.print("b= ");
        b=sc.nextInt();
        System.out.print("tong= " +(a+b));
    }
}
