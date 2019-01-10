/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goi;

/**
 *kiểm tra chẵn lẻ
 * @author Ngo Huy
 */
public class test {
    public static void main(String[] args) {
    try {
        int a =0;//
        int b = 42/a;
        System.out.println("b = "+b);
        try {
            if(a==1){
            a=a/(a-a);
            }
            if(a==2){
            int c[]={2};
            c[5]=3;
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Có lỗi vượt quá chỉ số mảng");
        }
}   catch (ArithmeticException e){
        System.out.println("Có lỗi mẫu số bằng 0");}
}}

