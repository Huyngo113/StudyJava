/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;

/**
 *
 * @author Ngo Huy
 */
public class fibonacci {
    public static int fibo (int n) {
        if (n==1||n==2) {
        return 1;
        } else {
        return fibo(n-2)+fibo(n-1);
        }
        
    }
}
