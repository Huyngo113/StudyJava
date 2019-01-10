/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
import java.util.Scanner;
/**
 *Tính tổng S(n) = x + x^3 +…+ x^(2n+1)
 * @author Ngo Huy
 */
public class bai15 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n;
        float x;
        int i=0;
        float S = 0;
        do {
            System.out.print("n= ");
            n=sc.nextInt();
        }
        while(n<=0);
        System.out.print("x= ");
        x=sc.nextFloat();
        for(;i<=n;i++){
           S+= Math.pow(x,2*i+1);
        }
        System.out.print("S= "+S);
    }
}
// chú ý khi chạy nhập dấu phẩy động ","