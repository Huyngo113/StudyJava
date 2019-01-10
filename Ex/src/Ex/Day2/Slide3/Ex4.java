/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day2.Slide3;
import java.util.Scanner;
/**
 * hhaapj vào tháng và năm, in ra màn hình số ngày của tháng nhập vào
 * @author Ngo Huy
 */
public class Ex4 {
    public static void main(String[] args) {
        int month;
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tháng và năm");
        month = sc.nextInt();
        year = sc.nextInt();
        switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng " +month+ " năm " +year+ " có 31 ngày");
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng " +month+ " năm " +year+ " có 30 ngày");
                break;
                case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Tháng " + month + " năm " + year + " có 29 ngày.");
                } else {
                    System.out.println("Tháng " + month + " năm " + year + " có 28 ngày.");
                }
                break;
        default:
            System.out.println("Tháng ko hợp lệ");
   
    }
        
    }
  
}
