/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bksoftwarevn.service;

import com.bksoftwarevn.model.Job;

/**
 *
 * @author Ngo Huy
 */
public interface IJob extends IBasic{
    //public Job enterData();
    //public void show(int id);
    //public Job search(int id);
    //public Job search(String title);
    //public boolean insert(Job job);
    //public boolean delete(int id);
    //public boolean update(int idCurrent, Job newJob);
     /*
    1. Them, sửa 1 viec lam (tuyen dung)
    2. Phe duyet bai dang, xoa (admin)
    3. Tìm kiem viec lam ( tuyen duyen, admin, nguoi tim viec)
    */
    
    /**
     * Chuc nang them viec lam danh cho nha tuyen dung
     * job: viec lam can them
     * id: ma viec lam tra ve sau khi them thanh cong
     * id < 0: them that bai, nguoc lai
     * @param job
     * @return id  
     */
    public int add(Job job); 
    
    /**
     * 
     * @param idCurrent
     * @param newJob
     * @return 
     */
    public boolean update(int idCurrent, Job newJob);
    
    /**
     * 
     * @param id
     * @return 
     */
    public boolean delete(int id);
    
    /**
     * 
     * @param id
     * @return 
     */
    public boolean approved(int id);
    
    /**
     * 
     * @param id
     * @return 
     */
    public Job search(int id);
    
}
