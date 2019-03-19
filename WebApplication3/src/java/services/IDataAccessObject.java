/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import model.User;

/**
 *
 * @author Ngo Huy
 */
public interface IDataAccessObject{
    //id:name:email:passs
    public boolean wiriteFile(String data, String path);
    public List<User> read(String path);
}
