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
public class Ex5 {
    //Viết chương trình nhập đơn giá và số lượng từ bàn phím sử dụng nextLine() của Scanner, sau đó chuyển đổi sang số nguyên và số thực để tính thành tiền
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String donGia;
    String soLuong;
    System.out.println("Nhập đơn giá");
    donGia =sc.nextLine();
    System.out.println("Nhập số lượng");
    soLuong =sc.nextLine();
    int sL = Integer.parseInt(soLuong);
    float dG = Float.parseFloat(donGia);
    float thanhTien = dG*sL;
    System.out.println("Thành tiền:" + thanhTien +"$");
    
    
    }
}
