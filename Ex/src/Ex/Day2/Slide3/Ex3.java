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
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float luong;
        float thue;
        System.out.println("nhập lương");
        luong =sc.nextFloat();
        if (luong<9000000) {
            System.out.println("Thuế=0 ");
        }
        else 
            if(luong>=9000000&&luong<15000000) {
            System.out.println("Thuế= " +luong*10/100);
        }
        else 
                if(luong>=15000000&&luong<=30000000) {
            System.out.println("Thuế= " +luong*15/100);
        }
        else 
                    if(luong>30000000) {
            System.out.println("Thuế= " +luong*20/100);
   
        }
    }
}
