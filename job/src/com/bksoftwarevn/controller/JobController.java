package com.bksoftwarevn.controller;

import com.bksoftwarevn.common.AppConst;
import static com.bksoftwarevn.common.AppConst.JOBS;
import com.bksoftwarevn.model.Company;
import com.bksoftwarevn.model.Job;
import com.bksoftwarevn.model.Location;
import com.bksoftwarevn.model.Website;
import com.bksoftwarevn.service.IJob;
import java.util.Scanner;

/**
 *
 * @author Ngo Huy
 */
public class JobController implements IJob {

    @Override
    public int add(Job job) {
//lay ra noi luu tru thong tin de them vao (database)
//AppConst.JOBS
//  so phan tu da them 
//AppConst.NUM_JOB_CURRENT
        int rs = -1;
//        int insdex = AppConst.NUM_JOB_CURRENT;
//        if (job != null) {
//            rs = job.getId();
//            if (rs > 0) {
//                AppConst.JOBS.set(insdex, job);
//                AppConst.NUM_JOB_CURRENT++;
//            }
//        }
        if (job != null && JOBS.add(job)) {
            rs = job.getId();
        }
        return rs;

    }

    @Override
    public boolean update(int idCurrent, Job newJob) {
        boolean rs = false;
//        tmp != null && trong dk if

        for (int i = 0; i < AppConst.JOBS.size(); i++) {
            Job tmp = AppConst.JOBS.get(i);
            try {
                if (tmp.getId() == idCurrent) {
                    tmp = newJob;
                    rs = true;
                }
            } catch (NullPointerException e) {
                System.out.println("tmp null" + e.getMessage());
            }
        }

        return rs;
    }

    @Override
    public boolean delete(int id) {
        boolean rs = false;
        for (int i = 0; i < AppConst.JOBS.size(); i++) {
            Job tmp = AppConst.JOBS.get(i);
            if (tmp != null && tmp.getId() == id) {
                tmp = null;
                rs = true;
            }
        }
        return rs;
    }

    @Override
    public boolean approved(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Job search(int id) {
        Job rs = null;
        // lay ra mang luu tru va duyet tim kiem
        for (int i = 0; i < AppConst.JOBS.size(); i++) {
            Job tmp = AppConst.JOBS.get(i);
            if (tmp != null && tmp.getId() == id) {
                rs = tmp;
            }
        }
        return rs;
    }

    @Override
    public void show(int id) {
        Job job = new Job();
        // gan job bang job co id truyen vao  bang cach viet ham tim kiem
        for (int i = 0; i < AppConst.JOBS.size(); i++) {
            Job tmp = AppConst.JOBS.get(i);
            if (tmp != null && tmp.getId() == id) {
                job = tmp;
            }
        }
        System.out.println("=============================");
        System.out.println("Title: " + job.getTitle());
    }

    @Override
    public Object enterData() {
        Job rs = null;
        // scanner de doc du lieu tu ban phim 
        // cho tung thuoc tinh
        rs = new Job();
        System.out.println("Nhap tieu de cho cong viec: ");
//        String title = new Scanner(System.in).nextLine(); 
//        rs.setTitle(title);
        rs.setTitle(new Scanner(System.in).nextLine());
        // thuoc tinh con lai tu lam
        System.out.println("Nhap URL: ");
        rs.setUrl(new Scanner(System.in).nextLine());
        System.out.println("Nhap số lượt xem: ");
        rs.setNumberView(new Scanner(System.in).nextInt());
        System.out.println("Nhap số lượt tuyển: ");
        rs.setNumberRecruit(new Scanner(System.in).nextLine());
        System.out.println("Nhap salary: ");
        rs.setSalary(new Scanner(System.in).nextLine());
        System.out.println("Nhap specialize: ");
        rs.setSpecialize(new Scanner(System.in).nextLine());
        System.out.println("Nhap age: ");
        rs.setAge(new Scanner(System.in).nextInt());
        System.out.println("Nhap formwork: ");
        rs.setFormWork(new Scanner(System.in).nextLine());
        System.out.println("Nhap mô tả: ");
        rs.setDesc(new Scanner(System.in).nextLine());
        System.out.println("Nhap benifit: ");
        rs.setBenifit(new Scanner(System.in).nextLine());
        System.out.println("Nhap requirement: ");
        rs.setRequirement(new Scanner(System.in).nextLine());
        System.out.println("Nhap info: ");
        rs.setSubmitInfo(new Scanner(System.in).nextLine());
        System.out.println("Nhap position: ");
        rs.setPosition(new Scanner(System.in).nextLine());
        //System.out.println("Nhap deadLine: ");
        //rs.setDeadline(new Scanner(System.in).nextLine());
        //System.out.println("Nhập địa điểm");
        //rs.setLocations(new Scanner(System.in).nextLine());
        Company company = new Company();
        System.out.println("Nhập công ty: ");
        company.setName(new Scanner(System.in).nextLine());
        rs.setCompany(company);

        Location location = new Location();
        System.out.println("Nhập địa chỉ: ");
        location.setId(new Scanner(System.in).nextInt());
        rs.setLocations(location);

        Website website = new Website();
        System.out.println("Nhap url website: ");
        website.setUrl(new Scanner(System.in).nextLine());
        rs.setWebsite(website);

        return rs;
    }

}
