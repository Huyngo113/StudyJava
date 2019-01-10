/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day2.Slide2;

/**
 *
 * @author Ngo Huy
 */
public class Ex7 {
    public static void main(String[] args) {
        int a=10;
        int b=7;
        int c=a++ + ++b - b-- - --b;
        System.out.println("c= " +c+ " b= " +b+ " a= " +a);
    }
 
}
