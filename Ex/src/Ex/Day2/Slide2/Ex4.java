/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day2.Slide2;
import java.util.Scanner;
/**
 *
 * @author Ngo Huy
 */
public class Ex4 {
   //Nhập 3 số từ bàn phím. Xây dựng biểu thức cho giá trị là true nếu 3 số thỏa mãn là 3 cạnh một tam giác(a+b.c)
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int a;
        int b;
        int c;
        System.out.println("Nhập vào số a=");
        a= sc.nextInt();
        System.out.println("Nhập vào số b=");
        b= sc.nextInt();
        System.out.println("Nhập vào số c=");
        c= sc.nextInt();
        boolean D=(a+b>c)||(a+c>b)||(c+b>a);
        System.out.println("D=" +D);
        if (D=true) {
        System.out.println("a,b,c là 3 cạnh của một tam giác");
        }
        else {
        System.out.println("a,b,c không phải 3 cạnh của một tam giác");
        }
    }
}
