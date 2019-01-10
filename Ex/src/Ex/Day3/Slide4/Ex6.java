/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day3.Slide4;

/**
 *xuất 8 bảng nhân từ 2 đến 9
 * @author Ngo Huy
 */
public class Ex6 {
    public static void main(String[] args) {
        int i=2;
        while (i<=9){
            int j=1;
            while (j<=10){
                System.out.println("ixj=" +(i*j));
                j++;
            }
            i++;
            System.out.println(" ");
        }
    }
}
