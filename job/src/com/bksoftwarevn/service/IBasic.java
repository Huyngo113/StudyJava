/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bksoftwarevn.service;

/**
 *
 * @author Ngo Huy
 */
public interface IBasic {
     /**
     *
     * @param id
     */
    public void show(int id);
    
    /**
     * 
     * @return Ä‘á»‘i tÆ°á»£ng sau khi nhap ( user, job)
     */
    public Object enterData();
}
