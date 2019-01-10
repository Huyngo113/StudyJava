/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 *
 * @author Ngo Huy
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("xin chào các bạn");
        
		String str1 = "itphutran.com";
		String[] arStr = str1.split("\\.");
		for (String item : arStr) {
			System.out.println(item);
		}
	}
        
    }
    

