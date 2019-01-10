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
public class Ex2 {
    //nhập vào chiều dài chiều rộng HCN sau đó Tính chu vi diện tích và in ra màn hình
    public static void main(String[] args) {
        float a;// nhập dữ liệu thập phân dùng dấu ","or"." vs 1 số máy.
        float b;// gán chú ý dùng "F"."D","L"
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập chiều dài HCN a=");
    a =sc.nextFloat();
    System.out.println("Nhập chiều rộng HCN b=");
    b =sc.nextFloat();
    if (a>=b) {
    System.out.println("Chu vi HCN là C= " +((a+b)*2)+ "(Đơn vị chiều dài)" );
    System.out.println("Diện tích HCN là S=" +(a*b)+ "(Đơn vị diện tích)");
    } 
    else  {
    System.out.println("Nhập sai dữ liệu: chiều dài phải lớn hơn bằng chiều rộng");
    }

    }
    
}
