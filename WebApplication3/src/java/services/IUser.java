/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author Ngo Huy
 */
public interface IUser {

    public Integer signup(String email, String password);

    public Integer signin(String email, String password);

    public boolean checkExist(String email);

    public boolean checkFormatPass(String pass);

    public boolean checkFormatEmail(String email);
}
