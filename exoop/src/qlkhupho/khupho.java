/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlkhupho;

import java.util.Scanner;

/**
 *
 * @author Ngo Huy
 */
public class khupho {
    static int n;//số hộ dân
    static hodan[] dsHoDan;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public hodan[] getDsHoDan() {
        return dsHoDan;
    }

    public void setDsHoDan(hodan[] dsHoDan) {
        this.dsHoDan = dsHoDan;
    }

    public khupho(int n, hodan[] dsHoDan) {
        this.n = n;
        this.dsHoDan = dsHoDan;
    }

    public khupho() {
    }
    //nhập hộ dân
    public void nhapHoDan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hộ dân cần nhập: ");
        n = sc.nextInt();
        this.dsHoDan = new hodan[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhập thông tin hộ dân thứ "+(i+1)+": ");
            this.dsHoDan[i]=new hodan();
            this.dsHoDan[i].dienThongTin();
        }
    }
    
    public void mungTho(int nam){
        people thanhVien[]=null;
        boolean a=false;
        int soTvien;
        int b;
        for(int i=0; i<khupho.n;i++)
        {
            b=0;
            thanhVien=dsHoDan[i].getThanhVien();
            soTvien=thanhVien.length;
                while(soTvien!=0){
                    if((nam-thanhVien[b].getDate().getYear()-1900)>=80)
                    {
                         a=true;
                         break;
                    }
                    soTvien--;
                    b++;
                }
            if(a==true)
                dsHoDan[i].hienThiTT();
         }
   }
}
