
package Ex.Day5.Slide6;

/**
 * tong hieu tich thuong min max, giai pt bac 1, a^b.
 * @author Ngo Huy
 */
public class MycasioLib {
    public static int sum(int a,int b) {
       int c = a+b;
       return c;
    }
    public static int hieu(int a, int b) {
        int c= a-b;
        return c;
    }
    public static long tich(int a, int b) {
        long c = a*b;
        return c;
    }

    /**
     *
     * @param a
     * @param b
     * @return a/b
     */
    public static double thuong(float a, float b) {
        double c;
        if (b!=0){c=a/b;} else{c=Double.NaN;}
        return c;
    }
    public static long mu (int a, int b) {
        long c=1;
        for(int i=1; i<=b;i++){
         c*=a;
        } return c;
    }
    //ax+b=c
    public static void ptb1(int a, int b, int c) {
        float x;
        if(a!=0){x=(c-b)/a;System.out.println("x = "+x);}
        if(a==0){
            if(b==c){System.out.println("pt luôn đúng");}
            else{System.out.println("pt vô nghiem");}
        }
    }
    public static int max(int a, int b) {
        int c;
        if (a>b){c=a;}else {c=b;}
        return c;
    }
     public static int min(int a, int b) {
        int c;
        if (a>b){c=b;}else {c=a;}
        return c;
    }
}
