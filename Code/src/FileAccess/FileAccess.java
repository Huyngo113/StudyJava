/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileAccess;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Ngo Huy
 */
public class FileAccess {
    /**
     * Ham ghi mot chuoi vao file
     *
     * @param data - chuoi can ghi
     * @param path - duong dan toi file
     * @return true/false
     */
    public static boolean writeFile(String data, String path) {
        boolean rs = false;
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            fos = new FileOutputStream(path, true);
            osw = new OutputStreamWriter(fos, "UTF-8");
            bw = new BufferedWriter(osw);
            bw.write(data);
            bw.newLine();
        } catch (FileNotFoundException e) {
            System.out.println("Duong dan toi file khong chinh xac. "
                    + "\nVui long kiem tra lai! Info: " + e.getMessage());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Encode UTF-8 khong duoc ho tro. Info: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("File khong cho phep ghi. Info: " + ex.getMessage());
        }finally{
            try {
                bw.close();
                osw.close();
                fos.close();
            } catch (IOException | NullPointerException ex) {
                System.out.println("Loi dong file: " + ex.getMessage());
            }
        }
        return rs;
    }
    
    public static void main(String[] args) {
        writeFile("Ngô Huy", "D:\\E F\\Test.txt");
    } 
}
