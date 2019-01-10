/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day3.Slide4;

/** tính tbc các số chia hết cho 3 từ 27 đến 250
 *
 * @author Ngo Huy
 */
public class Ex2 {
    public static void main(String[] args) {
        int a=0;
        int i=0;
        int sum=0;       ;
        float tbc;
        while(a<249){
            a= 27 +i*3;
            sum += a;
            i++;
        }
        System.out.println("i= " +i);
        System.out.println("a= " +a);
        tbc=sum/(i);
        System.out.println("trung bình cộng= " +tbc);
    }
}
