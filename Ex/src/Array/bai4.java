/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 * Viết hàm tìm vị trí của giá trị nhỏ nhất đầu tiên trong mảng số nguyên
 *
 * @author Ngo Huy
 */
public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            float c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Lỗi logic toán học" + e.getMessage());
        }

    }

}
