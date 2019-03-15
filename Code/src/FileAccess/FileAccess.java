/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileAccess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public static boolean writeFile(String data, String pathFolder, String fileName) {
        boolean rs = false;
        File file = null;
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        String path = pathFolder + File.separator + fileName;
        try {
            file = new File(path);
//            System.out.println("File ton tai hay khong? " + file.exists());
//            System.out.println("File la thu muc hay khong? " + file.isDirectory());
//            System.out.println("File co ten la gi? " + file.getName());
//            System.out.println("File co duong dan tuyet doi la gi? " + file.getAbsolutePath());
//            System.out.println("File co kich thuoc la bao nhieu? " + file.length() + " bytes");

            if (!file.exists() && new File(pathFolder).mkdirs()) {
                new File(pathFolder, fileName).createNewFile();
            }

            fos = new FileOutputStream(file, true);
            osw = new OutputStreamWriter(fos, "UTF-8");
            bw = new BufferedWriter(osw);
            bw.write(data);
            bw.newLine();
            rs = true;
        } catch (FileNotFoundException e) {
            System.out.println("Duong dan toi file khong chinh xac. "
                    + "\nVui long kiem tra lai! Info: " + e.getMessage());
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Encode UTF-8 khong duoc ho tro. Info: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("File khong cho phep ghi. Info: " + ex.getMessage());
        } finally {
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

    public static boolean readFile(String pathFolder, String fileName) {
        boolean rs = false;
        String path = pathFolder + File.separator + fileName;
        File file = null;
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            file = new File(path);
            if (file.exists()) {
                // thuc hien doc file
                fis = new FileInputStream(file);
                isr = new InputStreamReader(fis, "UTF-8");
                br = new BufferedReader(isr);

                String data = br.readLine();
                System.out.println(data);

            }
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.out.println("Co loi: " + e.getMessage());
        } catch (IOException ex) {
            System.out.println("Co loi: " + ex.getMessage());
        } finally {
            try {
                br.close();
                isr.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(FileAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return rs;
    }

    public static void main(String[] args) {
//        writeFile("Ngô Huy", "D:\\E F\\Test.txt");
//        writeFile("23", "D:\\E F\\Test.txt");      
        readFile("D:\\E F", "Test.txt");
    }
}
