/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day2.Slide3;
import java.util.Scanner;
/** tìm hiểu giải thuật DOOMSDAY
 *
 * @author Ngo Huy
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        int month;
        int year;
        System.out.println("Nhập vào ngày tháng và năm");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Năm " + year + " là năm nhuận.");
                } else {
                    System.out.println("Năm "  + year + " là năm không nhuận.");
                }
        
    }
}
