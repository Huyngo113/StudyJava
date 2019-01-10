/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex.Day6.Slide7;

/**
 * thực hành phương thức trong String
 * @author Ngo Huy
 */
public class Ex1 {
    public static void main(String[] args) {
        String name ="      abcdXYZghjklNm ";
        String name1 = name.toLowerCase();System.out.println("Chuyển về in thường:"+name1);
        name = name.toUpperCase();System.out.println("Đổi in hoa:"+name);
        name = name.trim();System.out.println("Cắt khoảng trắng:"+name);
        int a = name.length(); System.out.println("Độ dài chuỗi:"+a);
        char b = name.charAt(2);System.out.println("Kí tự ví trí số 2:"+b);
        String first = name.substring(0,3); System.out.println("Lấy kí tự từ index a đến index <b:"+first);
        String change= name.replace("N","n");System.out.println("Đổi tất cả các kí tự a thành kí tự b:"+change);
        String arr[]= name.split("\\s");System.out.println(arr);//???
        System.out.println(name.equals(first));
        System.out.println(name.contains(first));
        System.out.println(name.startsWith("N"));
        System.out.println(name.matches(name1));
        System.out.println(name.indexOf(first));
        
}}
