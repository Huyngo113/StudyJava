/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day3.Slide4;
import java.util.Scanner;
/**
 * tính tông các số dương theo lưu đồ thuật toán slide 4 do...while
 * @author Ngo Huy
 */
public class Ex9 {
    public static void main(String[] args) {
    Scanner sc = new  Scanner(System.in); 
        int so;
        int tong=0;
        do {
            System.out.println("Nhập số");
            so = sc.nextInt();
            if (so >0 ){
            tong += so;
            System.out.println("tổng= " +tong);
            }
            else {System.out.println("Mời nhập lại số dương");}
        }
        while (true);
    }
    
}
