/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Work;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Ngo Huy
 */
public class User {
    private int id;
    private String userId;
    private String name;
    private String email;
    private String password;
    private String roleId;
    private boolean status;      

    public User(int id, String userId, String name, String email, String password, String roleId, boolean status) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.roleId = roleId;
        this.status = status;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password + ", roleId=" + roleId + ", status=" + status + '}';
    }

   

    
    public boolean login (User[] users){
        boolean rs = false;
        for (int i = 0; i <users.length; i++) {
        System.out.println(users[i]);
        System.out.println("-----------------------");
        User u = users[i]; 
        if(u!=null&&this.email!=null&&this.email.equals(u.getEmail())&&this.password!=null&&this.password.equals(u.getPassword())){
        rs = true;
        }
        }
    return rs;
    }
    public boolean signin (User[] users, int daDangKi ){
        boolean rs = false;
        if(users!=null&&users.length>daDangKi){
            System.out.println("Nhập email: ");
            String email = new Scanner(System.in).nextLine();
            System.out.println("Nhập Pass: ");
            String pass = new Scanner(System.in).nextLine();
        
        if(email!=null&&!email.isEmpty()&&pass!=null&&pass.length()>=8){
            int check =0;
            User u = new User(email, pass);
            for (int i=0; i<=daDangKi;i++){}
        }
        }
    return rs;
    }
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(int id, String userId) {
        this.id = id;
        this.userId = userId;
    }
   
}
