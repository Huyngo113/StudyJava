/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *Viết hàm tìm giá trị dương đầu tiên trong mảng 1 chiều số thực
 * @author Ngo Huy
 */
public class bai2 {
    //static double a[]={-2.3,-3.6,3,6,-3.4}
    public static void main(String[] args) {
        double a[]={-2.3,-3.6,3,6,-3.4};
        double num = positive(a);
        if (num==-1){System.out.print("ko có giá trị dương");}
        else {System.out.println("giá trị dương đầu tiên là: "+num);}
    }
    public static double positive (double a[]) {
        double num=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
            num=a[i];
            break;
            }
           
    } return num;
    }
}

