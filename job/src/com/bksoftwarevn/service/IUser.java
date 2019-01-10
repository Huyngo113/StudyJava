/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bksoftwarevn.service;

import com.bksoftwarevn.model.User;

/**
 *
 * @author Ngo Huy
 */
public interface IUser {
    /**
    public User enterData();
    public void show(int id);
    public User search(int id);
    public User search(String name);
    public boolean insert(User user);
    public boolean delete(int id);
    public boolean update(int idCurrent, User newUser);
    */
     /*
    1. Dang ky  
        1.1 : Nhap thong tin dang ky
        1.2: kiem tra email co dung dinh dang khong
        1.3: Kiem tra pass co du 8 ky tu khong va chua it nhat 1 chu cai
    2. Dang nhap
    3. Them, sua, xoa, tim kiem 1 user
    */
    
    /**
     * 
     * @param email
     * @param pass
     * @return 
     */
    public boolean login(String email, String pass);
    
    /**
     * 
     * @param name
     * @param email
     * @param pass
     * @param comfimPass
     * @return 
     */
    public boolean signin (String name, String email, String pass, String comfimPass);
    
    /**
     * 
     * @param user
     * @return 
     */
    public int add (User user);
    
    /**
     *
     * @param idCurrent
     * @param newUser
     * @return
     */
    public boolean update(int idCurrent, User newUser);
    
    /**
     * 
     * @param id
     * @return 
     */
    public boolean delete(int id);
}
