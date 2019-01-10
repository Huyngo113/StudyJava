/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlkhupho;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ngo Huy
 */
public class people {
    private String name;
    private String job;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "people{" + "name=" + name + ", job=" + job + ", date=" + date + '}';
    }

    public people() {
    }

    public people(String name, String job, Date date) {
        this.name = name;
        this.job = job;
        this.date = date;
    }
    //Điền thông tin
    public void fillinfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String ns = sc.nextLine();
        this.date = chuyenStringDate(ns);
        System.out.println("Nhập nghề nghiệp: ");   
        this.job = sc.nextLine();
    }
    //Chuyển ngày sinh từ dạng String sang Date
    public Date chuyenStringDate(String ngay)
    {
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        Date ns=null;
        try
        {
            ns=sdf.parse(ngay);
        }catch(Exception e)
        {
            System.out.println("Loi dinh dang thoi gian.!");
        }
        return ns;
    }
    //show infor
    public void showinfor(){
        System.out.println("Họ và tên: "+this.name);
        System.out.println("Ngày sinh: "+this.date);
        System.out.println("Công việc: "+this.job);
    }
}
