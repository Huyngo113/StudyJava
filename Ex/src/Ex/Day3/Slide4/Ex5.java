/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day3.Slide4;
import java.util.Scanner;
/**
 *tính tổng các số từ min đến max. min max nhập từ bàn phím.
 * @author Ngo Huy
 */
public class Ex5 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int max;
        int min;
        int tong = 0;
        System.out.println("Nhập min= ");
        min = sc.nextInt();
        System.out.println("Nhập max= ");
        max = sc.nextInt();
        int i= min;
        while (i<=max){
        tong += i;
        i++;
        }
        System.out.println("Tổng" +tong);
    
}    
}
