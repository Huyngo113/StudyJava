/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bksoftwarevn.service;

import com.bksoftwarevn.model.Location;

/**
 *
 * @author Ngo Huy
 */
public interface ILocation {
    public Location enterData();
    public void show(int id);
    public Location search(int id);
    public boolean insert(Location location);
    public boolean delete(int id);
    public boolean update(int idCurrent, Location newLocation);
}
