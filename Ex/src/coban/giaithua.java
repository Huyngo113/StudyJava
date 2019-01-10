/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coban;
/**
 *
 * @author Ngo Huy
 */
public class giaithua {
    public static long GT(int n) { // tại sao lại là long mà ko phải void ?? 
       int a=1; int i=1; int S=0;
       for (;i<=n;i++){
       a*=i;
       }
       return a;// tạo phương thức phải cho biết nó cho ra (trả về) kết quả nào a hay i, th này là a.
    }
       
}
