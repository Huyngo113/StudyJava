/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day2.Slide3;
import java.util.Scanner;
/** Tính căn bậc 2 của số dương nhập vào từ bàn phím.
 *
 * @author Ngo Huy
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        System.out.println("Nhập vào số a");
        a = sc.nextFloat();
        if (a>=0) {
            System.out.println("Căn bậc 2 của a bằng " +Math.sqrt(a));
        }
        
    }
}
