/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day3.Slide4;

/**
 *in ra bảng cửu chương bằng for
 * @author Ngo Huy
 */
public class Ex7 {
    public static void main(String[] args) {
        System.out.println("                        *****BẢNG CỬU CHƯƠNG*****");//2 vòng lặp
        for (int i=2;i<=9;i++){
        for (int j=1;j<=10;j++){
            System.out.printf(i+"x" +j+ "="+(i*j)+ "\t");
        }
            System.out.println(" ");
            System.out.println("--------------------------------------------------------------------------------");
        }
        System.out.println("                        *****BẢNG CỬU CHƯƠNG*****");//1 vòng lặp 
        for (int i=2;i<=9;i++){
        System.out.println(i+"*"+1+"="+(i*1));
        System.out.println(i+"*"+2+"="+(i*2));
        System.out.println(i+"*"+3+"="+(i*3));
        System.out.println(i+"*"+4+"="+(i*4));
        System.out.println(i+"*"+5+"="+(i*5));
        System.out.println(i+"*"+6+"="+(i*6));
        System.out.println(i+"*"+7+"="+(i*7));
        System.out.println(i+"*"+8+"="+(i*8));
        System.out.println(i+"*"+9+"="+(i*9));
        System.out.println(i+"*"+10+"="+(i*10));
        System.out.println("------------------");
        }
        System.out.println("                    *******BẢNG CỬU CHƯƠNG*******");//1 vòng lặp
        for (int i=1;i<10;i++){
            System.out.println("2x"+i+"="+(2*i)+"\t 3x"+i+"="+(3*i)+"\t 4x"+i+"="+(4*i)+"\t 5x"+i+"="+(5*i)+"\t 6x"+i+"="+(6*i)+"\t 7x"+i+"="+(7*i)+"\t 8x"+i+"="+(8*i)+"\t 9x"+i+"="+(9*i));
        }
    }
    
    
}
