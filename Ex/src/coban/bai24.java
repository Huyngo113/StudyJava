/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
import static coban.fibonacci.fibo;
/**
 *công thức tính số fibonacci thứ n
 * @author Ngo Huy
 */
public class bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("n = ");
            n = sc.nextInt();
        }while(n <= 0);
         
        // print out the Fibonacci
        System.out.format("%dth Fibonacci is: %d", n, fibo(n));
 
    }
    }

