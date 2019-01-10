/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day2.Slide3;
import java.util.Scanner;
/**
 * viết ct tính căn bậc 2 của số bất kì nhập từ bàn phím. thông báo lỗi nếu nhập sai
 * @author Ngo Huy
 */
public class Ex2 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
         float a;
         System.out.println("Nhập vào số a");
         a = sc.nextFloat();
         if (a>=0) {
             System.out.println("Căn bậc 2 của số a= " +Math.sqrt(a));
         }
         else {
             System.out.println("error");
            
    }
    }
  
}
