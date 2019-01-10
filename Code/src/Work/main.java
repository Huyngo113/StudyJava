/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Work;

/**
 *
 * @author Ngo Huy
 */
public class main {
    public static void main(String[] args) {
        Company c = new Company();
        c.setId(1);
        c.setName("BNS");
        c.setAddress("Hà Nội");
        c.setDecs("Truyện");
        c.setLogo("https://www.google.com/search?q=hibhf&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjf1PeQ0aXeAhWLbrwKHWW-AJoQ_AUIDigB&biw=1366&bih=636#imgrc=rgDhkcCGYwztGM:");
        c.setWepside("https://bachngocsach.com/reader/pham-nhan-tu-tien-chi-tien-gioi-thien-convert");
        System.out.println(c);
        System.out.println(c.getId());
        Company d = c;
        System.out.println(d==c);
        System.out.println(d.equals(c));
        System.out.println("--------------------------------");
        c.showinforcp();
        System.out.println("--------------------------------");
        User[] users = new User[10];
        users[0] = new User("a","a" );
        users[1] = new User("2", "b");
        
        User u = new User("a", "a");
        System.out.println(u.login(users));
        System.out.println(u.getEmail());
    }
}
