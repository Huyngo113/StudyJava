/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bksoftwarevn.service;

import com.bksoftwarevn.model.Role;

/**
 *
 * @author Ngo Huy
 */
public interface IRole {
    public Role enterData();
    public void show(int id) ;
    public Role search(int id);
    public Role search(String name);
    public boolean insert(Role role);
    public boolean delete(int id);
    public boolean update(int idCurrent, Role newRole);
}
