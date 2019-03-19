/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import common.AppConst;
import java.util.List;
import model.User;

/**
 *
 * @author Ngo Huy
 */
public class UserService implements IUser {

    HService dao = new HService();

    @Override
    public boolean checkFormatPass(String pass) {
        Boolean rs = false;
        if (pass != null && pass.length() >= 8) {
            String regexChar = ".*([a-zA-Z]+).*";
            String regexNum = ".*([0-9]+).*";
            String regexSpec = ".*(\\W+).*";
            if (pass.matches(regexNum) && pass.matches(regexChar)
                    && pass.matches(regexSpec)) {
                rs = true;
            }
        }
        return rs;
    }

    @Override
    public boolean checkFormatEmail(String email) {
        Boolean rs = false;
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (email != null && email.matches(regex)) {
            rs = true;
        }
        return rs;
    }

    public Integer countUser() {
        List<User> users = getAllData();
        return users.size();
    }

    @Override
    public Integer signup(String email, String password) {
        Integer rs = -1;
        if (email != null && password != null && !checkExist(email)) {
            // co the kiem tra dinh dang email, pass
            //1:manhnd:12312387651 
            int id = countUser() + 1;
            String data = id + ":" + email + ":" + password;
            boolean kq = dao.wiriteFile(data, AppConst.DATA_PATH);
            if (kq) {
                rs = id;
            }
        }
        return rs;
    }

    @Override
    public Integer signin(String email, String password) {
        Integer rs = -1;
        if (email != null && password != null) {
            List<User> users = getAllData();
            User tmp = new User(email, password);
            for (User user : users) {
                if (tmp.equals(user)) {
                    rs = user.getId();
                    break;
                }
            }
        }
        return rs;
    }

    @Override
    public boolean checkExist(String email) {
        boolean rs = false;
        if (email != null) {
            List<User> users = getAllData();
            for (User user : users) {
                if (user != null && email.equals(user.getEmail())) {
                    rs = true;
                }
            }
        }
        return rs;
    }

    private List<User> getAllData() {
        return dao.read(AppConst.DATA_PATH);
    }

}
