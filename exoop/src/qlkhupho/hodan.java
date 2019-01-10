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
public class hodan {
    private String soNha;
    private int soTvien;
    private people[] thanhVien;

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public int getSoTvien() {
        return soTvien;
    }

    public void setSoTvien(int soTvien) {
        this.soTvien = soTvien;
    }

    public people[] getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(people[] thanhVien) {
        this.thanhVien = thanhVien;
    }


    public hodan(String soNha, int soTvien, people[] thanhVien) {
        this.soNha = soNha;
        this.soTvien = soTvien;
        this.thanhVien = thanhVien;
    }

    public hodan() {}
    //điền thông tin
    public void dienThongTin(){
        this.thanhVien = new people[this.soTvien];
        Scanner sc = new Scanner(System.in);
        System.out.println("Số nhà: ");
        this.soNha = sc.nextLine();
        System.out.println("Số thành viên trong gia đình: ");
        this.soTvien = sc.nextInt();
        for(int i = 0; i<this.soTvien;i++){
        System.out.println("Thành viên thứ "+(i+1)+" trong gia đình là: ");
        thanhVien[i].fillinfor();
        }
    }
    //hiển thị thong tin
    public void hienThiTT(){
        System.out.println("Số nhà: "+this.soNha);
        System.out.println("Số thành viên: "+this.soTvien);
        for(int i = 0; i<this.soTvien;i++){
        System.out.println("Thành viên thứ "+(i+1)+" là: ");this.thanhVien[i].showinfor();
        }
    }
    
}
