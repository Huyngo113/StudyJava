/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day4.Slide5;

/**
 *
 * @author Ngo Huy
 */
public class Ex2 {
    public static void main(String[] args) {
        int a[]={3,9,8,7};
        int i=0;
        int tong=0;
        float tbc=0;
        System.out.println("a.length= "+a.length);
        for (;i<=a.length;i++){
            System.out.println(a[i]+"^"+3+"="+(a[i]*a[i]*a[i]));
            tong+=a[i];
        }
        System.out.println("tong= " +tong);
        tbc=tong/i;
        System.out.println("Trung bình cộng= " +tbc);
    }
}
