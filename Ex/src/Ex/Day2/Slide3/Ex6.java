/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day2.Slide3;
import java.util.Scanner;
/**
 *
 * @author Ngo Huy
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        int op;
        System.out.println("1 là phép +");
        System.out.println("2 là phép trừ");
        System.out.println("3 là phép nhân");
        System.out.println("4 là phép chia");
        System.out.println("Mời chọn đúng chức năng");
        System.out.println("Nhập op= ");
        op = sc.nextInt();
        switch (op){
            case 1: System.out.println("a= ");a= sc.nextDouble();System.out.println("b= ");b= sc.nextDouble(); c=a+b; System.out.println(a+"+"+b+"=" +c); break;
            case 2: System.out.println("a= ");a= sc.nextDouble();System.out.println("b= ");b= sc.nextDouble(); c=a-b; System.out.println(a+"-"+b+"=" +c); break;
            case 3: System.out.println("a= ");a= sc.nextDouble();System.out.println("b= ");b= sc.nextDouble(); c=a*b; System.out.println(a+"*"+b+"=" +c); break;
            case 4: System.out.println("a= ");a= sc.nextDouble();System.out.println("b= ");b= sc.nextDouble(); 
                    if(b==0) {System.out.println("b phải khác 0");}
                    else {c=a/b; System.out.println(a+"/"+b+"=" +c);} 
                    break;
            
            default:
                System.out.println("Chức năng chưa hoàn thiện");
        }
    }
}
