/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day6.Slide7;
import static Ex.Day6.Slide7.signup.EMAIL;
import static Ex.Day6.Slide7.signup.PASS;
import java.util.Scanner;
/**
 * login
 * @author Ngo Huy
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email,pass;
        boolean rs=false;
        System.out.print("Nhập email:"); email= sc.nextLine();
        System.out.print("Nhập pass: "); pass=sc.nextLine();
        if(email!=null&&email.length()>0&&pass!=null){
        if(email.equals(EMAIL) && pass.equals(PASS)){
            System.out.println("Đăng nhập thành công");}else{System.out.println("Thất bai!");}
        }
        }
    }


