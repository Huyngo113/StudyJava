/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bksoftwarevn.service;

import com.bksoftwarevn.model.Company;

/**
 *
 * @author Ngo Huy
 */
public interface ICompany {
    public Company enterData();
    public void show(int id);
    public Company search(int id);
    public Company search(String name);
    public boolean insert(Company company);
    public boolean delete(int id);
    public boolean update(int idCurrent, Company newCompany);

}
