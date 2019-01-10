/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day6.Slide7;
import java.util.Scanner;
/**
 * signup signup
 * @author Ngo Huy
 */
public class signup {
    static String EMAIL[]= new String[10];
    static String PASS[]= new String[10];
    public static boolean signup (String email, String pass, String passComfim) {
        boolean rs=false;
        if(email!=null&&email.length()>0&&pass!=null&&!passComfim.isEmpty()&&pass.equals(passComfim)){
        int check =0;
        for(int i= 0; i<EMAIL.length;i++){if(email.equals(EMAIL)) check=1;}
        if(check==0) EMAIL[0]=email; PASS[0]=pass;rs=true;
        }
        return rs;
    }
    public static void main(String[] args) {
        String email,pass, passComfim;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập email: "); email = sc.nextLine();
        System.out.print("Nhập pass:  "); pass = sc.nextLine();
        System.out.print("Passcomfim: "); passComfim =sc.nextLine();
        if(signup(email, pass, passComfim)){System.out.println("Đăng kí thành công!");}
        else{System.out.println("Thất bai!Email đã được sử dụng.");}
    }
}
