/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day1.Slide1;
import java.util.Scanner;

/**
 *
 * @author Ngo Huy
 */
public class Ex1nhaptubanphim {
   //nhập dữ liệu từ bàn phím
    public static void main(String[] args) {
        int a;// nếu khai báo kiểu dữ liệu "String" nhớ viết đúng chữ "S" viết hoa
        int b;
        int c;
        //local
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a=");  
        a = sc.nextInt(); // có thể đổi chỗ nhưng phải dưới dòng khai báo sc
        System.out.println("a=" +a);
        System.out.println("Nhập b=");  
        b = sc.nextInt(); //chú ý viết hoa chữ I trong Int, tương tự với trường hợp khác.
        System.out.println("b=" +b);
        c=a+b;
        System.out.println("Tổng c=" +c);
        
    }

}
