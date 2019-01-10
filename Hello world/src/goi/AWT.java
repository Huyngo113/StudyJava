/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goi;
import java.awt.*;
/**
 *
 * @author Ngo Huy
 */
public class AWT extends Frame{
    public AWT(String title) {
        super(title);
        this.setBounds(100, 150, 200, 200);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new AWT ("First app");
    }
}


