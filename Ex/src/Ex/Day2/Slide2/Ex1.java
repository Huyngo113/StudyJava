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
public class Ex1 {
   // khai báo dữ liệu thích hợp và in ra màn hình
    public static void main(String[] args) {
        String hoTen;
        double diem;
        int age ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Họ tên");  
        hoTen =sc.nextLine(); 
        System.out.println("Họ Tên: " +hoTen);
        System.out.println("Bạn bao nhiêu tuổi");
        age =sc.nextInt();
        System.out.println("Tuổi: " +age);
        System.out.println("Nhập Điểm=");  
        diem =sc.nextDouble(); 
        System.out.println("Điểm: " +diem);
       
    }
}
