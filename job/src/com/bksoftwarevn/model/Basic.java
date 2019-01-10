/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bksoftwarevn.model;

/**
 *
 * @author nghie
 */
public abstract class Basic {
    private int  id;

    public Basic() {
    }

    public Basic(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public abstract void show(int id);
}
