/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bksoftwarevn.service;

import com.bksoftwarevn.model.Website;

/**
 *
 * @author Ngo Huy
 */
public interface IWebsite {
    public Website enterData();
    public void show(int id);
    public Website search(int id);
    public Website search(String name);
    public boolean insert(Website website);
    public boolean delete(int id);
    public boolean update(int idCurrent, Website newWebsite);
}
