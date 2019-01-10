/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hust.manhnd.bai6;

/**
 *
 * @author nghiemmanh
 */
public class StringDemo {

    static String EMAIL[] = new String[10];

    static String PASS[] = new String[10];

    public static void main(String[] args) {
        boolean kq = signup("nghi", "123", "123");
        if (kq) {
            System.out.println("Dang ky thanh cong");
        } else {
            System.out.println("That bai");
        }

        boolean login = login("nghi1", "123");
        System.out.println(login);
    }

    public static boolean signup(
            String email, String pass, String passComfirm) {
        boolean rs = false;
        if (email != null && email.length() > 0
                && pass != null && !pass.isEmpty()
                && passComfirm != null && !passComfirm.isEmpty()
                && pass.equals(passComfirm)) {
            int check = 0;
            for (int i = 0; i < EMAIL.length; i++) {
                if (email.equals(EMAIL[i])) {
                    check = 1;
                }
            }
            if (check == 0) {
                EMAIL[0] = email;
                PASS[0] = pass;
                rs = true;
            }
        }
        return rs;
    }

    public static boolean login(String email, String pass) {
        boolean rs = false;
        if (email != null && !email.isEmpty()) {
            for (int i = 0; i < EMAIL.length; i++) {
                if (email.equals(EMAIL[i])
                        && PASS[i] != null && PASS[i].equals(pass)) {
                    rs = true;
                }
            }
        }
        return rs;
    }
}
